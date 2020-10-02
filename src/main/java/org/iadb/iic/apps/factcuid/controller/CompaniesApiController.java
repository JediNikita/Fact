package org.iadb.iic.apps.factcuid.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.service.CompaniesApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@RestController
public class CompaniesApiController implements CompaniesApi {

	private static final Logger log = LoggerFactory.getLogger(CompaniesApiController.class);
	private final ObjectMapper objectMapper;
	private final HttpServletRequest request;


	@Autowired
	private CompaniesApiService cas;

	
	@Autowired
	public CompaniesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@RequestMapping(value="/", method= RequestMethod.GET)
	public ResponseEntity<Void> showHello(){
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> addCompany(@Valid Company company) {
		
		cas.addCompany(company);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> deleteCompany(Long companyId, String apiKey) {
		cas.deleteCompany(companyId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Company>> findCompaniessByParams( @NotNull @Valid String portfolio, @Valid Boolean isPDExpired) {
		List<Company> companyList= new ArrayList<>();
		companyList= cas.getCompanyListByParams(portfolio, isPDExpired);
		String accept = request.getHeader("Accept");
			
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<Company>>(objectMapper.readValue(new Gson().toJson(companyList), new TypeReference<List<Company>>() {
				}) , HttpStatus.OK) ;
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<Company>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<List<Company>>(companyList,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Company> getCompanyById(Long companyId) {
		String accept = request.getHeader("Accept");
		Company comp= cas.getCompanyById(companyId);
		if(comp==null)
			return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
		else {
			
			if (accept != null && accept.contains("application/json")) {
				try {
					return new ResponseEntity<Company>(objectMapper.readValue(new Gson().toJson(comp), Company.class), HttpStatus.OK);
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<Company>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		}
		return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<List<Company>> getCompanyList() {
		return new ResponseEntity<List<Company>>(cas.getAllCompanies(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> partialUpdateCompany(Long companyId, @Valid Company company) {
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> updateCompany(@Valid Company company) {
		cas.updateCompany(company);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
