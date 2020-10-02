package org.iadb.iic.apps.factcuid.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.dao.CompaniesDao;
import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyApiServiceImpl implements CompaniesApiService {
	
	@Autowired
	private CompaniesDao compDao;
	
	@Override
	public List<Company> getCompanyListByParams(@NotNull @Valid String portfolio,
			@Valid Boolean isPDExpired) {

		return compDao.getCompanyListByParams(portfolio, isPDExpired);
	}

	@Override
	public Company getCompanyById(Long companyId) {
		return compDao.getCompanyById(companyId);
	}

	@Override
	public void addCompany(@Valid Company company) {
		compDao.addCompany(company);
	}

	@Override
	public void deleteCompany(Long companyId) {
		compDao.deleteCompany(companyId);
		
	}

	@Override
	public List<Company> getAllCompanies() {
		
		return compDao.getAllCompanies();
	}

	@Override
	public void updateCompany(@Valid Company company) {
		compDao.updateCompany(company);
	}

}
