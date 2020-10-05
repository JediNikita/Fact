package org.iadb.iic.apps.factcuid.dao;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.dao.mapper.PDResultSetExtractor;
import org.iadb.iic.apps.factcuid.dao.mapper.PDRowMapper;
import org.iadb.iic.apps.factcuid.dao.mapper.CompanyResultSetExtractor;
import org.iadb.iic.apps.factcuid.dao.mapper.CompanyRowMapper;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompaniesDaoImpl implements CompaniesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CompanyFinancialsDao cfdao;

	@Override
	public void addCompany(@Valid Company company) {
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
				+ "                    VALUES ();";

	}


	@Override
	public Company getCompanyById(String companyId) {
		String sql= "SELECT * FROM COMPANY C WHERE C.comp_id_number=?;";
		Company comp= (Company) jdbcTemplate.queryForObject(sql, new Object[] {companyId}, new CompanyRowMapper());
		System.out.println(comp);
		return comp;
	}


	@Override
	public void deleteCompany(String companyId) {
		String sql= "DELETE C FROM COMPANY WHERE C.comp_id_pkey=?;";
		int flag= jdbcTemplate.update(sql, new Object[] {companyId});
		System.out.println(flag);
	}


	@Override
	public CompanyFinancials getCompanyFinancials(String companyId) {
		CompanyFinancials cf= new CompanyFinancials();
		cfdao.setPDDetails(cf, companyId);
		cfdao.setFinancialStatementDetails(cf, companyId);	
		return cf;

	}


	@Override
	public void update(String companyId, @Valid Company company) {
		/*
		 * String sql= "UPDATE company SET comp_id_pkey = ?, comp_elmt_id_fkey = ?, " +
		 * "comp_usgrp_id_fkey = ?, comp_portfolio = ?, comp_model =?, comp_name =?, comp_sector = ?, "
		 * +
		 * "comp_group_id_fkey =?, comp_lock_mask = ?, comp_creation_date =?, comp_creation_user_id_fkey = ?, "
		 * +
		 * "comp_modification_date =?, comp_modification_user_id_fkey =?, comp_id_number = ?, comp_bankscope_id =?, "
		 * +
		 * "comp_domicile_country_iso =?, comp_analyst_user_id_fkey =?, comp_spread_type = ?, comp_type =?, comp_workflow_status = ?, "
		 * +
		 * "comp_statement_key = ?, comp_finance_sector = ?, comp_finance_sub_sector ?, comp_last_pd_rating = ?, comp_layout_format =?, "
		 * +
		 * "comp_has_archives = ?, comp_has_approved_archives = ?, comp_file_to_import = ?, comp_govt_support_type = ?, "
		 * +
		 * "comp_govt_support_yesno = ?, comp_operation_country_iso = ?, comp_construction_country_iso =  WHERE comp_id_number = ?"
		 * ;
		 */
		String sql= "UPDATE COMPANY C SET comp_id_pkey=? , comp_name=?, comp_id_number=?, comp_domicile_country_iso=?";
		
		Object[] params= {company.getCompanyId(), company.getCompanyName(), company.getCompanyIdNumber(), company.getCompanyDomicileCountryIso()};
		
		jdbcTemplate.update(sql, params);
	}


}
