package org.iadb.iic.apps.factcuid.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.websocket.server.ServerEndpoint;

import org.iadb.iic.apps.factcuid.dao.FacilityDao;
import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FacilityApiServiceImpl implements FacilityApiService{

	@Autowired
	private FacilityDao facDao;
	
	@Override
	public List<RiskFacility> findFacilityRatings() {
		return facDao.findFacilityRatings();
	}

	@Override
	public List<RiskFacility> findFacilityRatingPeriod(@NotNull @Valid String periodo) {
		// TODO Auto-generated method stub
		return facDao.findFacilityRatingByPeriod(periodo);
	}

	@Override
	public RiskFacility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo) {
		// TODO Auto-generated method stub
		return facDao.findFacilityRatingByIdAndPeriod(facilityId, periodo);
	}

}
