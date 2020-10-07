package org.iadb.iic.apps.factcuid.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.iadb.iic.apps.factcuid.dao.FacilityDao;
import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.iadb.iic.apps.factcuid.model.RiskFacilityLGD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FacilityApiServiceImpl implements FacilityApiService{

	@Autowired
	private FacilityDao facDao;

	@Override
	public void postFacility(@Valid RiskFacility body) {
		facDao.postFacility(body);
		
	}

	@Override
	public RiskFacilityLGD getFacilityLgd(Integer facilityId) {
		return facDao.getFacilityLgd(facilityId);
	}

	@Override
	public RiskFacility getFacility(Integer facilityId) {
		return facDao.getFacility(facilityId);
	}
	
	
}
