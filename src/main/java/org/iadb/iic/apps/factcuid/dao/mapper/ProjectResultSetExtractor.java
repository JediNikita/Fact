package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.Project;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ProjectResultSetExtractor implements ResultSetExtractor<Project>{

	@Override
	public Project extractData(ResultSet rs) throws SQLException, DataAccessException {
		Project project = new Project();
		
		project.setCompanyId(rs.getString("proj_comp_id_fkey"));
		project.setProjId(rs.getInt("proj_id_pkey"));
		project.setProjName(rs.getString("proj_name"));
		project.setProjNumber(rs.getString("proj_number"));
		project.setProjOperationNumber(rs.getString("proj_operation_number"));
		project.setProjOpusOtherCompCount(rs.getInt("proj_opus_other_comp_count"));
		project.setProjOpusSection(rs.getString("proj_opus_sector"));
		project.setProjOpusSector(rs.getString("proj_opus_section"));
		project.setProjTeamLeader(rs.getString("proj_maestro_creator_id_fkey"));
		
		return project;
	}
	
	

}
