package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FacilityResultSetExtractor implements ResultSetExtractor<RiskFacility> {

	@Override
	public RiskFacility extractData(ResultSet rs) throws SQLException, DataAccessException {
		RiskFacility facility= new RiskFacility();
		while(rs.next()) {
			facility.setFacDescription(rs.getString("fac_description"));
			facility.setFacLoanNumber(rs.getString("fac_loan_number"));
			facility.setFacNumber(rs.getInt("fac_number"));
			facility.setFacOpusAmount(rs.getInt("fac_opus_amount"));
			facility.setFactId(rs.getInt("fac_id_pkey"));
			facility.setProjId(rs.getInt("fac_senpath_proj_id_fkey"));
		}
		return facility;

	}

}
