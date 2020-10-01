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

		List<Company> companyList= new ArrayList<>();
		
		return companyList;
	}

	@Override
	public Company getCompanyById(Long companyId) {
		compDao.getCompanyById(companyId);
		
		return null;
	}

	@Override
	public void addCompany(@Valid Company company) {
		compDao.addCompany(company);
	}

}
