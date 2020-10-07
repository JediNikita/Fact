package org.iadb.iic.apps.factcuid.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import io.swagger.annotations.*;

import org.iadb.iic.apps.factcuid.model.Company;
import org.iadb.iic.apps.factcuid.model.Project;
import org.iadb.iic.apps.factcuid.service.ProjectApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.io.IOException;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-05T07:05:17.201Z[GMT]")
@RestController
public class ProjectApiController implements ProjectApi {

	private static final Logger log = LoggerFactory.getLogger(ProjectApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private ProjectApiService pas;

	@org.springframework.beans.factory.annotation.Autowired
	public ProjectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public ResponseEntity<Project> getProject(@ApiParam(value = "Fact Project Id",required=true) @PathVariable("projId") Integer projId
			) {
		String accept = request.getHeader("Accept");
		Project project= pas.getProject(projId);
		if(project.getProjId()==null)
			return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
		else
		{
			if (accept != null && accept.contains("application/json")) {
				try {
					return new ResponseEntity<Project>(objectMapper.readValue(new Gson().toJson(project), Project.class), HttpStatus.OK);
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<Project>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
			else
				return new ResponseEntity<Project>(HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@Override
	public ResponseEntity<Void> postproject(@Valid Project body) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			pas.postProject(body);
			return new ResponseEntity<>(HttpStatus.OK); 
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
	}

}
