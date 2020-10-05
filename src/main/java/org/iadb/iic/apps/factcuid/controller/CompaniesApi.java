package org.iadb.iic.apps.factcuid.controller;

import io.swagger.annotations.*;

import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.CompanyFinancials;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T07:05:17.201Z[GMT]")
@Api(value = "companies", description = "the companies API")
public interface CompaniesApi {

    @ApiOperation(value = "GetCompany", nickname = "getCompany", notes = "Get company by id", response = Company.class, authorizations = {
        @Authorization(value = "apiKeyHeader"),
@Authorization(value = "apiKeyQuery")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieve Company", response = Company.class),
        @ApiResponse(code = 400, message = ""),
        @ApiResponse(code = 404, message = "Company Not Found") })
    @RequestMapping(value = "/companies/{companyId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Company> getCompany(@ApiParam(value = "Fact Company Id",required=true) @PathVariable("companyId") String companyId
);


    @ApiOperation(value = "GetCompanyFinancials", nickname = "getCompanyFinancials", notes = "Get PD and Financial Statement", response = CompanyFinancials.class, authorizations = {
        @Authorization(value = "apiKeyHeader"),
@Authorization(value = "apiKeyQuery")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "PD and Financial Statement", response = CompanyFinancials.class),
        @ApiResponse(code = 400, message = ""),
        @ApiResponse(code = 404, message = "") })
    @RequestMapping(value = "/companies/{companyId}/financials",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CompanyFinancials> getCompanyFinancials(@ApiParam(value = "Fact Company Id",required=true) @PathVariable("companyId") String companyId
);


    @ApiOperation(value = "PostCompany", nickname = "postCompany", notes = "PostCompany", authorizations = {
        @Authorization(value = "apiKeyHeader"),
@Authorization(value = "apiKeyQuery")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = ""),
        @ApiResponse(code = 400, message = ""),
        @ApiResponse(code = 409, message = "") })
    @RequestMapping(value = "/companies",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> postCompany(@ApiParam(value = ""  )  @Valid @RequestBody Company body
);


    @ApiOperation(value = "UpdateCompany", nickname = "updateCompany", notes = "Update Company definition", authorizations = {
        @Authorization(value = "apiKeyHeader"),
@Authorization(value = "apiKeyQuery")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 400, message = ""),
        @ApiResponse(code = 404, message = "") })
    @RequestMapping(value = "/companies/{companyId}",
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> updateCompany(@ApiParam(value = "FACT Company Id",required=true) @PathVariable("companyId") String companyId
,@ApiParam(value = "Change Company Details"  )  @Valid @RequestBody Company body
);

}

