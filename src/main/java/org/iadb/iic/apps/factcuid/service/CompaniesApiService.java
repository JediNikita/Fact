package org.iadb.iic.apps.factcuid.service;

import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.stereotype.Service;

@Service
public interface CompaniesApiService {

	public Company getCompanyById(int companyId) ;

	public int addCompany(@Valid Company company);

	public void updateCompany(int companyId, @Valid Company company);

	public CompanyFinancials getCompanyFinancials(int companyId);
}
