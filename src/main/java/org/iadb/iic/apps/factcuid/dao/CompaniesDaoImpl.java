package org.iadb.iic.apps.factcuid.dao;

import javax.validation.Valid;

import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CompaniesDaoImpl implements CompaniesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public void addCompany(@Valid Company company) {
		String sql = "INSERT INTO COMPANY (ID,COMPANYNAME,COMPANYTYPE,DOMICILECOUNTRYISO,ORGUNIQUEID, PORTFOLIO, UNIQUEID) VALUES (?,?,?,?,?,?,?);";
		jdbcTemplate.update(sql, company.getId(), company.getCompanyName(), company.getCompanyType(), company.getDomicileCountryISO(), company.getOrgUniqueId(),
				company.getPortfolio());
	}


	@Override
	public void getCompanyById(Long companyId) {
		String sql= "SELECT C FROM COMPANY C WHERE C.COMPANY_ID=?;";
		Company comp= jdbcTemplate.query
	}

}
