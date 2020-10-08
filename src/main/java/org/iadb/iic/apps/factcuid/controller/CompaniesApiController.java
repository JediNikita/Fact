package org.iadb.iic.apps.factcuid.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.iadb.iic.apps.factcuid.service.CompaniesApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

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

	@Override
	public ResponseEntity<Company> getCompany(int companyId) {
		String accept = request.getHeader("Accept");
		Company comp= cas.getCompanyById(companyId);
		if(comp.getCompanyId()==null)
			return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
		else {
			if (accept != null && accept.contains("application/json")) {
				try {
					return new ResponseEntity<Company>(objectMapper.readValue(new Gson().toJson(comp), Company.class), HttpStatus.OK);
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<Company>(HttpStatus.BAD_REQUEST);
				}
			}
			else 
				return new ResponseEntity<Company>(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<CompanyFinancials> getCompanyFinancials(int companyId) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			CompanyFinancials compfin= cas.getCompanyFinancials(companyId);
			if(compfin==null)
				return new ResponseEntity<CompanyFinancials>(HttpStatus.NOT_FOUND);
			else
				try {
					return new ResponseEntity<CompanyFinancials>(objectMapper.readValue(new Gson().toJson(compfin), CompanyFinancials.class), HttpStatus.OK);
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<CompanyFinancials>(HttpStatus.BAD_REQUEST);
				}
		}
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<Void> postCompany(@Valid Company body) {
		String accept = request.getHeader("Accept");
		Company comp= cas.getCompanyById(body.getCompanyId());
		if(comp.getCompanyId()!=null)
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		else {
			if (accept != null && accept.contains("application/json")) {
				cas.addCompany(body);
				return new ResponseEntity<>(HttpStatus.CREATED); 
			}
			else
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<Void> updateCompany(int companyId, @Valid Company body) {
		String accept = request.getHeader("Accept");
		Company comp= cas.getCompanyById(body.getCompanyId());
		if (accept != null && accept.contains("application/json")) {
			if(comp.getCompanyId()!=null) {
				cas.updateCompany(companyId, body);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

}
