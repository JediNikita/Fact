package org.iadb.iic.apps.factcuid.service;

import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.iadb.iic.apps.factcuid.model.RiskFacilityLGD;

public interface FacilityApiService {
	
	void postFacility(@Valid RiskFacility body);

	RiskFacilityLGD getFacilityLgd(Integer facilityId);

	RiskFacility getFacility(Integer facilityId);

}
