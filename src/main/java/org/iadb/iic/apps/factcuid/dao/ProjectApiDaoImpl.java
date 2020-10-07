package org.iadb.iic.apps.factcuid.dao;

import java.util.Date;

import javax.validation.Valid;

import org.iadb.iic.apps.factcuid.dao.mapper.ProjectResultSetExtractor;
import org.iadb.iic.apps.factcuid.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectApiDaoImpl implements ProjectApiDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Project getProject(Integer projId) {
		String sql= "SELECT * FROM PROJECT P WHERE P.PROJ_NUMBER=? ;";
		Project project= jdbcTemplate.query(sql, new Object[] {projId}, new ProjectResultSetExtractor());
		System.out.println(project);
		return project;
	}

	@Override
	public void postProject(@Valid Project body) {
		String sql= "INSERT INTO project ( proj_id_pkey, proj_elmt_id_fkey, proj_creation_user_id_fkey, proj_creation_date, "
				+ "proj_modification_user_id_fkey, proj_modification_date, proj_lock_mask, proj_usgrp_id_fkey, proj_comp_id_fkey, "
				+ "proj_name, proj_status, proj_number, proj_active_status, proj_colpath_juris_country_iso, proj_senpath_juris_country_iso, "
				+ "proj_analysis_date, proj_sector_fac_colpath, proj_sector_fac_senpath, proj_historical_project_id_fkey, "
				+ "proj_comp_final_pd_rating, proj_is_historical, proj_operation_number, proj_opus_sector, proj_opus_section, "
				+ "proj_opus_other_comp_count, proj_maestro_creator_id_fkey ) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);" ;
		
		Object params[] = {body.getProjId(), body.getProjId().toString(),"12", new Date(), "12", new Date(), "000000000000000000000000",
				null, body.getCompanyId(),body.getProjName(), "VLD_PROJECT_STATUS_R1", "VLD_ACTIVE_INACTIVE_R1", null, null, 
				new Date(), null, null, null, null, null, body.getProjOperationNumber(), body.getProjOpusSector(), body.getProjOpusSection(), 
				body.getProjOpusOtherCompCount(), body.getProjTeamLeader()};
		
		jdbcTemplate.update(sql, params);
	}
	
	

}
