package org.iadb.iic.apps.factcuid.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.RiskFacility;

public interface FacilityApiService {

	List<RiskFacility> findFacilityRatings();

	List<RiskFacility> findFacilityRatingPeriod(@NotNull @Valid String periodo);

	RiskFacility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo);

}
