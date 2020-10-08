package org.iadb.iic.apps.factcuid.dao;

import org.iadb.iic.apps.factcuid.dao.mapper.FinancialStatementResultSetExtractor;
import org.iadb.iic.apps.factcuid.dao.mapper.PDResultSetExtractor;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyFinancialsDaoImpl implements CompanyFinancialsDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public CompanyFinancials setPDDetails(int companyId) {
		CompanyFinancials cf= new CompanyFinancials();
		String sql=  "SELECT * FROM pd where pd.COMPANY_ID=?;";
		cf= jdbcTemplate.query(sql, new Object[] {companyId}, new PDResultSetExtractor());
		setFinancialStatementDetails(cf,companyId);
		return cf;
	}

	@Override
	public CompanyFinancials setFinancialStatementDetails(CompanyFinancials cf, int companyId) {
		String sql=  "SELECT * FROM FINANCIAL_STATEMENT FS where FS.COMPANY_ID=?;";
		CompanyFinancials temp= jdbcTemplate.query(sql, new Object[] {companyId}, new FinancialStatementResultSetExtractor());
		cf.setNetIncome(temp.getNetIncome());
		cf.setNetIncomeValidDate(temp.getNetIncomeValidDate());
		cf.setTotalAssets(temp.getTotalAssets());
		cf.setTotalAssetsValidDate(temp.getTotalAssetsValidDate());
		cf.setTotalEquity(temp.getTotalEquity());
		cf.setTotalEquityValidDate(temp.getTotalEquityValidDate());
		cf.setTotalRevenue(temp.getTotalRevenue());
		cf.setTotalRevenueValidDate(temp.getTotalRevenueValidDate());
		return cf;
	}

}
