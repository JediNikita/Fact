package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Facility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class FacilityDaoImpl implements FacilityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Facility> findFacilityRatings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Facility> findFacilityRatingByPeriod(@NotNull @Valid String periodo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo) {
		// TODO Auto-generated method stub
		return null;
	}

}
