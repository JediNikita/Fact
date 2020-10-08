package org.iadb.iic.apps.factcuid.dao;

import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;

public interface CompaniesDao {

	int addCompany(@Valid Company company);

	Company getCompanyById(int companyId);

	CompanyFinancials getCompanyFinancials(int companyId);

	void update(int companyId, @Valid Company company);


}
