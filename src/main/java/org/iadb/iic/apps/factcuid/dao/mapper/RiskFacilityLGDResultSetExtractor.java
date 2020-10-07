package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.RiskFacilityLGD;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class RiskFacilityLGDResultSetExtractor implements ResultSetExtractor<RiskFacilityLGD> {

	@Override
	public RiskFacilityLGD extractData(ResultSet rs) throws SQLException, DataAccessException {
		RiskFacilityLGD lgd= new RiskFacilityLGD();
		
		lgd.setApprovedDatetime(rs.getString("FAC_LAST_APPROVED_DATE"));
		lgd.setExpirationDate(null);
		lgd.setFacilityId(rs.getString("fac_id_pkey"));
		lgd.setLgDPerc(rs.getBigDecimal("fac_final_lgd"));
		
		return lgd;
	}

}
