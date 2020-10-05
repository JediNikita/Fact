package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.RiskFacility;

public interface FacilityDao {

	List<RiskFacility> findFacilityRatings();

	List<RiskFacility> findFacilityRatingByPeriod(@NotNull @Valid String periodo);

	RiskFacility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo);


}
