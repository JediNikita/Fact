package org.iadb.iic.apps.factcuid.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Facility;

public interface FacilityApiService {

	List<Facility> findFacilityRatings();

	List<Facility> findFacilityRatingPeriod(@NotNull @Valid String periodo);

	Facility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo);

}
