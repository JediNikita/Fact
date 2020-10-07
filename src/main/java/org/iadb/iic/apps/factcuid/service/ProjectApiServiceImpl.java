package org.iadb.iic.apps.factcuid.service;

import javax.validation.Valid;

import org.iadb.iic.apps.factcuid.dao.ProjectApiDao;
import org.iadb.iic.apps.factcuid.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectApiServiceImpl implements ProjectApiService {

	@Autowired
	private ProjectApiDao pad;
	
	@Override
	public Project getProject(Integer projId) {
		
		return pad.getProject(projId);
	}

	@Override
	public void postProject(@Valid Project body) {
		pad.postProject(body);
	}

}
