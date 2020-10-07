package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CompanyResultSetExtractor implements ResultSetExtractor<Company>{
	
	@Override
	public Company extractData(ResultSet rs) throws SQLException {
		Company comp= new Company();
		while(rs.next()) {
			comp.setCompanyIdNumber(rs.getString("comp_id_number"));
			comp.setCompanyId(rs.getString("comp_id_pkey"));
			comp.setCompanyDomicileCountryIso(rs.getString("comp_domicile_country_iso"));
			comp.setCompanyName(rs.getString("comp_name"));
		}
		return comp;
	}

}
