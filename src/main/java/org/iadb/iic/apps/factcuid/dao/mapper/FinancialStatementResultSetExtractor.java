package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FinancialStatementResultSetExtractor implements ResultSetExtractor<CompanyFinancials>{

	@Override
	public CompanyFinancials extractData(ResultSet rs) throws SQLException, DataAccessException {
		CompanyFinancials cf= new CompanyFinancials();
		while(rs.next())
		{
			switch ((rs.getString("FINANCIAL_TYPE")).toUpperCase()) {
				case "NETSALES" :
				case "SPBANKNETINCOME":
					cf.setNetIncome(rs.getDouble("FINANCIAL_VALUE"));
					cf.setNetIncomeValidDate(rs.getString("PERIOD"));
				case "TOTALASSETS":
					cf.setTotalAssets(rs.getDouble("FINANCIAL_VALUE"));
					cf.setTotalAssetsValidDate(rs.getString("PERIOD"));
				case "TOTALREVENUES":
				case "SPBANKTOTALOPERATINGREVENUE":
					cf.setTotalRevenue(rs.getDouble("FINANCIAL_VALUE"));
					cf.setTotalRevenueValidDate(rs.getString("PERIOD"));
				case "TOTALSHAREHOLDERSEQUITY":
				case "BANKTOTALEQUITY":
					cf.setTotalEquity(rs.getDouble("FINANCIAL_VALUE"));
					cf.setTotalEquityValidDate(rs.getString("PERIOD"));
			}
		}
		return cf;
	}

}
