package org.iadb.iic.apps.factcuid.dao.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.transform.DefaultFieldSet;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.validation.BindException;

public class CommonResultSetExtractor<T> extends BeanWrapperFieldSetMapper<T> implements RowMapper<T> {

	@Override
    public T mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final FieldSet fs = getFieldSet(rs);
        System.out.println();
        try {
            return super.mapFieldSet(fs);
        } catch (final BindException e) {
            throw new IllegalArgumentException("Could not bind bean to FieldSet", e);
        }
    }

    private FieldSet getFieldSet(final ResultSet rs) throws SQLException {
        final ResultSetMetaData metaData = rs.getMetaData();
        final int columnCount = metaData.getColumnCount();

        final List<String> tokens = new ArrayList<>();
        final List<String> names = new ArrayList<>();

        for (int i = 1; i <= columnCount; i++) {
            tokens.add(rs.getString(i));
            names.add(metaData.getColumnName(i));
        }

        return new DefaultFieldSet(tokens.toArray(new String[0]), names.toArray(new String[0]));    
    }

	
}
