package org.iadb.iic.apps.factcuid.dao;

import org.iadb.iic.apps.factcuid.model.CompanyFinancials;

public interface CompanyFinancialsDao {

	CompanyFinancials setPDDetails(CompanyFinancials cf, String companyId);

	CompanyFinancials setFinancialStatementDetails(CompanyFinancials cf, String companyId);

}
