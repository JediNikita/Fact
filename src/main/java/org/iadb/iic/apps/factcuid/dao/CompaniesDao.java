package org.iadb.iic.apps.factcuid.dao;

import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;

public interface CompaniesDao {

	int addCompany(@Valid Company company);

	Company getCompanyById(String companyId);

	void deleteCompany(String companyId);

	CompanyFinancials getCompanyFinancials(String companyId);

	void update(String companyId, @Valid Company company);


}
