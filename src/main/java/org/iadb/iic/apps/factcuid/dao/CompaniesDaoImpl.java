package org.iadb.iic.apps.factcuid.dao;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.dao.mapper.CompanyResultSetExtractor;
import org.iadb.iic.apps.factcuid.dao.mapper.CompanyRowMapper;
import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	public Company getCompanyById(Long companyId) {
		String sql= "SELECT C FROM COMPANY C WHERE C.COMPANY_ID=?;";
		Company comp= (Company) jdbcTemplate.queryForObject(sql, new Object[] {companyId}, BeanPropertyRowMapper.newInstance(Company.class));
		System.out.println(comp);
		return comp;
	}


	@Override
	public List<Company> getCompanyListByParams(@NotNull @Valid String portfolio, @Valid Boolean isPDExpired) {
		List<Company> companyList= new ArrayList<>();
		String sql= "SELECT C FROM COMPANY C WHERE C.PORTFOLIO=? AND C.ISPDEXPIRED=?;";
		companyList= jdbcTemplate.queryForList(sql, Company.class, new Object[] {portfolio, isPDExpired});
		return companyList;
	}


	@Override
	public void deleteCompany(Long companyId) {
		String sql= "DELETE C FROM COMPANY WHERE C.COMPANYID=?;";
		int flag= jdbcTemplate.update(sql, new Object[] {companyId});
		System.out.println(flag);
	}


	@Override
	public List<Company> getAllCompanies() {
		String sql= "SELECT * FROM COMPANY;";
		List<Company> companyList= new ArrayList<>();
		companyList= jdbcTemplate.queryForList(sql, Company.class);
		return companyList;
	}


	@Override
	public void updateCompany(@Valid Company company) {
		
	}

	
}
