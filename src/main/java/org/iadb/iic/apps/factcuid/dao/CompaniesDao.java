package org.iadb.iic.apps.factcuid.dao;

import javax.validation.Valid;

import org.iadb.iic.apps.factcuid.model.Company;

public interface CompaniesDao {

	void addCompany(@Valid Company company);

	void getCompanyById(Long companyId);

}
