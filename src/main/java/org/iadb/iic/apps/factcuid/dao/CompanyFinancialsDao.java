package org.iadb.iic.apps.factcuid.dao;

import org.iadb.iic.apps.factcuid.model.CompanyFinancials;

public interface CompanyFinancialsDao {

	CompanyFinancials setPDDetails(int companyId);

	CompanyFinancials setFinancialStatementDetails(CompanyFinancials cf, int companyId);

}
