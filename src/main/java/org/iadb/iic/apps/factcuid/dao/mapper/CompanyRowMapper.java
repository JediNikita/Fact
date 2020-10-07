package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.jdbc.core.RowMapper;

public class CompanyRowMapper implements RowMapper<Company> {

	@Override
	public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		/*
		 * CompanyResultSetExtractor extractor= new CompanyResultSetExtractor(); return
		 * extractor.extractData(rs);
		 */
		
		Company comp= new Company();
		comp.setCompanyIdNumber(rs.getString("comp_id_number"));
		comp.setCompanyId(rs.getInt("comp_id_pkey"));
		comp.setCompanyDomicileCountryIso(rs.getString("comp_domicile_country_iso"));
		comp.setCompanyName(rs.getString("comp_name"));
		return comp;
	}

	
}
