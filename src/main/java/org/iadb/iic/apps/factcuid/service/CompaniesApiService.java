package org.iadb.iic.apps.factcuid.service;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.stereotype.Service;

@Service
public interface CompaniesApiService {

	public Company getCompanyById(String companyId) ;

	public void addCompany(@Valid Company company);

	public void deleteCompany(String companyId);

	public void updateCompany(String companyId, @Valid Company company);

	public void getCompanyFinancials(String companyId);
}
