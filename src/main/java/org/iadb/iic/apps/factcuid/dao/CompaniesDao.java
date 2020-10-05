package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;

public interface CompaniesDao {

	void addCompany(@Valid Company company);

	Company getCompanyById(String companyId);

	void deleteCompany(String companyId);

	CompanyFinancials getCompanyFinancials(String companyId);

	void update(String companyId, @Valid Company company);


}
