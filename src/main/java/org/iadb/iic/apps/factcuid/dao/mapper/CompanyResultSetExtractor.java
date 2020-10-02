package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.Company;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CompanyResultSetExtractor implements ResultSetExtractor{
	
	public Object extractData(ResultSet rs) throws SQLException {
		Company comp= new Company();
		comp.setId(rs.getLong(1));
		return comp;
	}

}
