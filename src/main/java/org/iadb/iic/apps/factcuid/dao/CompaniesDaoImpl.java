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
import org.springframework.stereotype.Repository;

@Repository
public class CompaniesDaoImpl implements CompaniesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
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
		jdbcTemplate.update(sql, company.getId(), company.getElementId(), company.getUserGroupId(),
				company.getPortfolio(), company.getCompanyModel(), company.getName(), company.getSector()
				, company.getGroupId(), company.getLockMask(), company.getCreationDate(),company.getCreationUser(),
				company.getModificationDate(), company.getModificationUser(), company.getIdNumber(), company.getBankScopeId(),
				company.getDomicileCountryISO(), company.getAnalystUserId(), company.getSpreadType(), company.getType(),
				company.getWorkflowStatus(), company.getStatementKey(), company.getFinanceSector(), company.getFinanceSubSector(),
				company.getLastPDRating(), company.getLayoutFormat(), company.getHasArchives(), company.getHasApprovedArchived(), 
				company.getFileToImport(), company.getGovtSupportType(), company.getHasGovtSupport(), company.getOperationCountryISO(),
				company.getConstructionCountryISO());
	}


	@Override
	public Company getCompanyById(Long companyId) {
		String sql= "SELECT C FROM COMPANY C WHERE C.comp_id_pkey=?;";
		Company comp= (Company) jdbcTemplate.queryForObject(sql, new Object[] {companyId}, BeanPropertyRowMapper.newInstance(Company.class));
		System.out.println(comp);
		return comp;
	}


	@Override
	public List<Company> getCompanyListByParams(@NotNull @Valid String portfolio, @Valid Boolean isPDExpired) {
		List<Company> companyList= new ArrayList<>();
		String sql= "SELECT C FROM COMPANY C WHERE C.comp_portfolio=? AND C.ISPDEXPIRED=?;";
		companyList= jdbcTemplate.queryForList(sql, Company.class, new Object[] {portfolio, isPDExpired});
		return companyList;
	}


	@Override
	public void deleteCompany(Long companyId) {
		String sql= "DELETE C FROM COMPANY WHERE C.comp_id_pkey=?;";
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
