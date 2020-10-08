package org.iadb.iic.apps.factcuid.dao;

import java.util.Date;
import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.dao.mapper.FacilityResultSetExtractor;
import org.iadb.iic.apps.factcuid.dao.mapper.RiskFacilityLGDResultSetExtractor;
import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.iadb.iic.apps.factcuid.model.RiskFacilityLGD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FacilityDaoImpl implements FacilityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void postFacility(@Valid RiskFacility body) {
		String sql = "INSERT INTO facility ( fac_id_pkey, fac_elmt_id_fkey, fac_creation_user_id_fkey, fac_creation_date, "
				+ "fac_modification_user_id_fkey, fac_modification_date, fac_lock_mask, fac_usgrp_id_fkey, fac_senpath_proj_id_fkey, "
				+ "fac_colpath_proj_id_fkey, fac_description, fac_path, fac_number, fac_subsector_type, fac_sentype_colpath, fac_sentype_senpath, "
				+ "fac_debt_below_percent, fac_ccf_percent, fac_ead, fac_outstanding, fac_limit, fac_base_lgd, fac_senpath_guar_id_fkey, "
				+ "fac_colpath_col_id_fkey, fac_name, fac_override_frr, fac_colpath_guar_id_fkey, fac_guar_cov_percent, fac_final_lgd, "
				+ "fac_total_assets, fac_total_liab, fac_total_senior_liab, fac_asset_coverage_ratio, fac_adjusted_base_lgd, fac_frr, "
				+ "fac_initial_pac_base_lgd, fac_override_justification, fac_comp_final_pd_rating, fac_pd_to_update, fac_final_grade, "
				+ "fac_final_grade_pct, fac_final_grade_override, fac_opus_id, fac_loan_number, fac_opus_amount, fac_nopath_proj_id_fkey, "
				+ "fac_impaired_loan, fac_specific_loss, fac_last_approved_lgd, fac_last_approved_date, fac_last_approver) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		Object[] params= {body.getFactId(),body.getFactId().toString(), "12", new Date(), "12", new Date(), 
				"0000000000000000000000000000000000000000000000", null,  body.getProjId(), body.getProjId(), body.getFacDescription(),
				null, body.getFacNumber(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
				null, null, null, null, null, null, null, null, null,"1", null, null, null, null, body.getFacLoanNumber(), body.getFacOpusAmount(), 
				null, "VLD_PROJECT_IMPAIRED_LOAN_R1", null, null, null, null};
		
		jdbcTemplate.update(sql, params);
	}

	@Override
	public RiskFacilityLGD getFacilityLgd(Integer facilityId) {
		String sql= "SELECT fac_id_pkey, fac_last_approved_date, fac_final_lgd FROM FACILITY F WHERE F.fac_id_pkey= ?;";
		return jdbcTemplate.query(sql, new Object[] {facilityId}, new RiskFacilityLGDResultSetExtractor());
	}

	@Override
	public RiskFacility getFacility(Integer facilityId) {
		String sql= "SELECT * FROM FACILITY F WHERE F.fac_id_pkey= ?;";
		return jdbcTemplate.query(sql, new Object[] {facilityId}, new FacilityResultSetExtractor());
	}
	
}
