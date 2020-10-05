package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import org.iadb.iic.apps.factcuid.dao.mapper.FinancialStatementRowMapper;
import org.iadb.iic.apps.factcuid.dao.mapper.PDRowMapper;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyFinancialsDaoImpl implements CompanyFinancialsDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public CompanyFinancials setPDDetails(CompanyFinancials cf, String companyId) {
		String sql=  "SELECT * FROM pd where pd.COMPANY_ID=?;";
		List<CompanyFinancials> list= jdbcTemplate.query(sql, new Object[] {companyId}, new PDRowMapper());
		return cf;
	}

	@Override
	public CompanyFinancials setFinancialStatementDetails(CompanyFinancials cf, String companyId) {
		String sql=  "SELECT * FROM FINANCIAL_STATEMENT FS where FS.COMPANY_ID=?;";
		cf= (CompanyFinancials) jdbcTemplate.query(sql, new Object[] {companyId}, new FinancialStatementRowMapper());
		return cf;
	}

}
