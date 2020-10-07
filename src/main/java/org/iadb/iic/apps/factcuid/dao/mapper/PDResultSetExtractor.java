package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class PDResultSetExtractor implements ResultSetExtractor<CompanyFinancials> {

	@Override
	public CompanyFinancials extractData(ResultSet rs) throws SQLException, DataAccessException {
		CompanyFinancials cf= new CompanyFinancials();
		while(rs.next()) {
			cf.setCompanyId(rs.getString("company_id"));
			cf.setApprovedDateTime(rs.getString("APPROVED_DATETIME")); //APPROVED_DATETIME
			cf.setApprovedPD(rs.getString("PD_IN_PROCESS"));
			cf.setCurrentPercForPDGrade(rs.getBigDecimal("CURRENT_PERC_FOR_PD_GRADE"));
			cf.setExpirationDate(rs.getString("EXPIRATION_DATE"));
			cf.setFactPDStatus(rs.getString("FACT_PD_STATUS"));
			cf.setIsExpired(rs.getInt("IS_EXPIRED"));
			cf.setLastPDRating(rs.getString("LAST_PD_RATING"));
		}
		return cf;
	}


}
