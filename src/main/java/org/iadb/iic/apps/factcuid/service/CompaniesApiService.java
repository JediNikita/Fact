package org.iadb.iic.apps.factcuid.service;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.stereotype.Service;

@Service
public interface CompaniesApiService {

	public List<Company> getCompanyListByParams( @NotNull @Valid String portfolio,
			@Valid Boolean isPDExpired);
	
	public Company getCompanyById(Long companyId) ;

	public void addCompany(@Valid Company company);

	public void deleteCompany(Long companyId);

	public List<Company> getAllCompanies();

	public void updateCompany(@Valid Company company);
}
