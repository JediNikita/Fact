package org.iadb.iic.apps.factcuid.dao;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FacilityDaoImpl implements FacilityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<RiskFacility> findFacilityRatings() {
		String sql="SELECT * FROM FACILITY F; ";
		List<RiskFacility> facilityList= new ArrayList<>();
		facilityList= jdbcTemplate.queryForList(sql, RiskFacility.class);
		return facilityList;
	}

	@Override
	public List<RiskFacility> findFacilityRatingByPeriod(@NotNull @Valid String periodo) {
		String sql="SELECT F FROM FACILITY F WHERE F.; ";
		List<RiskFacility> facilityList= new ArrayList<>();
		facilityList= jdbcTemplate.queryForList(sql, RiskFacility.class);
		return facilityList;
	}

	@Override
	public RiskFacility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo) {
		// TODO Auto-generated method stub
		return null;
	}

}
