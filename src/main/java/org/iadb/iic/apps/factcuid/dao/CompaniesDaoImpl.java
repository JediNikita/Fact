package org.iadb.iic.apps.factcuid.dao;

import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.dao.mapper.CompanyRowMapper;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompaniesDaoImpl implements CompaniesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CompanyFinancialsDao cfdao;

	@Override
	public int addCompany(@Valid Company company) {
		String sql = "INSERT INTO company (\r\n"
				+ "                        comp_id_pkey,\r\n"
				+ "                        comp_elmt_id_fkey,\r\n"
				+ "                        comp_usgrp_id_fkey,\r\n"
				+ "                        comp_portfolio,\r\n"
				+ "                        comp_model,\r\n"
				+ "                        comp_name,\r\n"
				+ "                        comp_sector,\r\n"
				+ "                        comp_group_id_fkey,\r\n"
				+ "                        comp_lock_mask,\r\n"
				+ "                        comp_creation_date,\r\n"
				+ "                        comp_creation_user_id_fkey,\r\n"
				+ "                        comp_modification_date,\r\n"
				+ "                        comp_modification_user_id_fkey,\r\n"
				+ "                        comp_id_number,\r\n"
				+ "                        comp_bankscope_id,\r\n"
				+ "                        comp_domicile_country_iso,\r\n"
				+ "                        comp_analyst_user_id_fkey,\r\n"
				+ "                        comp_spread_type,\r\n"
				+ "                        comp_type,\r\n"
				+ "                        comp_workflow_status,\r\n"
				+ "                        comp_statement_key,\r\n"
				+ "                        comp_finance_sector,\r\n"
				+ "                        comp_finance_sub_sector,\r\n"
				+ "                        comp_last_pd_rating,\r\n"
				+ "                        comp_layout_format,\r\n"
				+ "                        comp_has_archives,\r\n"
				+ "                        comp_has_approved_archives,\r\n"
				+ "                        comp_file_to_import,\r\n"
				+ "                        comp_govt_support_type,\r\n"
				+ "                        comp_govt_support_yesno,\r\n"
				+ "                        comp_operation_country_iso,\r\n"
				+ "                        comp_construction_country_iso\r\n"
				+ "                    )\r\n"
				+ "                    VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		Object[] params= {company.getCompanyId(),null ,null , "VLD_PORTFOLIO_R1", "", company.getCompanyName(), "",null,"0000000000000000000000000000",
				new java.util.Date(), "12", new java.util.Date(), "12", company.getCompanyIdNumber(),"" , company.getCompanyDomicileCountryIso(),
				null, "",null, null, null, null, null, null, null, null, null, null, null, null, null, null};
		
		jdbcTemplate.update(sql, params);
		return company.getCompanyId();
	}


	@Override
	public Company getCompanyById(String companyId) {
		String sql= "SELECT * FROM COMPANY C WHERE C.comp_id_pkey=?;";
		Company comp=  jdbcTemplate.queryForObject(sql, new Object[] {companyId}, new CompanyRowMapper());
		return comp;
	}


	@Override
	public void deleteCompany(String companyId) {
		String sql= "DELETE C FROM COMPANY WHERE C.comp_id_number=?;";
		int flag= jdbcTemplate.update(sql, new Object[] {companyId});
		System.out.println(flag);
	}


	@Override
	public CompanyFinancials getCompanyFinancials(String companyId) {
		CompanyFinancials cf= new CompanyFinancials();
		cf=cfdao.setPDDetails(companyId);
		return cf;
	}


	@Override
	public void update(String companyId, @Valid Company company) {
		String sql= "UPDATE COMPANY SET comp_id_pkey=? , comp_name=?, comp_id_number=?, comp_domicile_country_iso=? where comp_id_pkey=?";
		
		Object[] params= {company.getCompanyId(), company.getCompanyName(), company.getCompanyIdNumber(), 
				company.getCompanyDomicileCountryIso(), companyId};
		
		jdbcTemplate.update(sql, params);
	}


}
