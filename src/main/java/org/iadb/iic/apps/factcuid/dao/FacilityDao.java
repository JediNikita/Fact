package org.iadb.iic.apps.factcuid.dao;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Facility;

public interface FacilityDao {

	List<Facility> findFacilityRatings();

	List<Facility> findFacilityRatingByPeriod(@NotNull @Valid String periodo);

	Facility findFacilityRatingByIdAndPeriod(String facilityId, @NotNull @Valid String periodo);


}
