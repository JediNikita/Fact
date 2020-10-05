package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class FinancialStatementRowMapper implements RowMapper {

	@Autowired
	FinancialStatementResultSetExtractor extractor;
	
	@Override
	public CompanyFinancials mapRow(ResultSet rs, int rowNum) throws SQLException {
		return extractor.extractData(rs);
	}

	
}
