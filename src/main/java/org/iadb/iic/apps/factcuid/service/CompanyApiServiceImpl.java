package org.iadb.iic.apps.factcuid.service;

import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.dao.CompaniesDao;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyApiServiceImpl implements CompaniesApiService {
	
	@Autowired
	private CompaniesDao compDao;
	
	@Override
	public Company getCompanyById(int companyId) {
		return compDao.getCompanyById(companyId);
	}

	@Override
	public int addCompany(@Valid Company company) {
		return compDao.addCompany(company);
	}

	@Override
	public void updateCompany(int companyId, @Valid Company company) {
		compDao.update(companyId, company);
	}

	@Override
	public CompanyFinancials getCompanyFinancials(int companyId) {
		return compDao.getCompanyFinancials(companyId);
	}


}
