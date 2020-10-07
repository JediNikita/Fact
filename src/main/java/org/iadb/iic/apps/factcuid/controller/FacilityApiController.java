package org.iadb.iic.apps.factcuid.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import io.swagger.annotations.*;

import org.iadb.iic.apps.factcuid.model.Project;
import org.iadb.iic.apps.factcuid.model.RiskFacility;
import org.iadb.iic.apps.factcuid.model.RiskFacilityLGD;
import org.iadb.iic.apps.factcuid.service.FacilityApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T07:05:17.201Z[GMT]")
@RestController
public class FacilityApiController implements FacilityApi {

	private static final Logger log = LoggerFactory.getLogger(FacilityApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private FacilityApiService fas;

	@org.springframework.beans.factory.annotation.Autowired
	public FacilityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public ResponseEntity<RiskFacility> getFacility(@ApiParam(value = "FACT facility id",required=true) @PathVariable("facilityId") Integer facilityId
			) {
		String accept = request.getHeader("Accept");
		RiskFacility facility= fas.getFacility(facilityId);
		if(facility.getFactId()==null)
			return new ResponseEntity<RiskFacility>(HttpStatus.NOT_FOUND);
		else
		{
			if (accept != null && accept.contains("application/json")) {
				try {
					return new ResponseEntity<RiskFacility>(objectMapper.readValue(new Gson().toJson(facility), RiskFacility.class), HttpStatus.OK);
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<RiskFacility>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			else
				return new ResponseEntity<RiskFacility>(HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@Override
	public ResponseEntity<RiskFacilityLGD> getfacilityLgd(@ApiParam(value = "FACT Facility id",required=true) @PathVariable("facilityId") Integer facilityId
			) {
		String accept = request.getHeader("Accept");
		RiskFacilityLGD facilityLGD= fas.getFacilityLgd(facilityId);
		if(facilityLGD.getFacilityId()==null) 
			return new ResponseEntity<RiskFacilityLGD>(HttpStatus.NOT_FOUND);
		else {
			if (accept != null && accept.contains("application/json")) {
				try {
					return new ResponseEntity<RiskFacilityLGD>(objectMapper.readValue(new Gson().toJson(facilityLGD), RiskFacilityLGD.class), HttpStatus.OK);
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<RiskFacilityLGD>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			else
				return new ResponseEntity<RiskFacilityLGD>(HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@Override
	public ResponseEntity<Void> postFacility(@ApiParam(value = "Facility details"  )  @Valid @RequestBody RiskFacility body
			) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			fas.postFacility(body);
			return new ResponseEntity<>(HttpStatus.OK); 
		}
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

}
