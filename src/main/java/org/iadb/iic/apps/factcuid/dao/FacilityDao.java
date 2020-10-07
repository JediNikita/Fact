package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.iadb.iic.apps.factcuid.model.RiskFacilityLGD;

public interface FacilityDao {

	void postFacility(@Valid RiskFacility body);

	RiskFacilityLGD getFacilityLgd(Integer facilityId);

	RiskFacility getFacility(Integer facilityId);


}
