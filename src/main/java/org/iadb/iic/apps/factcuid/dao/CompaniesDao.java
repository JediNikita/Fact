package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Company;

public interface CompaniesDao {

	void addCompany(@Valid Company company);

	Company getCompanyById(Long companyId);

	List<Company> getCompanyListByParams(@NotNull @Valid String portfolio, @Valid Boolean isPDExpired);

	void deleteCompany(Long companyId);

	List<Company> getAllCompanies();

	void updateCompany(@Valid Company company);

}
