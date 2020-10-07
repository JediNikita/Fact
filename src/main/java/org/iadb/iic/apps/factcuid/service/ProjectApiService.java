package org.iadb.iic.apps.factcuid.service;

import javax.validation.Valid;

import org.iadb.iic.apps.factcuid.model.Project;

public interface ProjectApiService {

	Project getProject(Integer projId);

	void postProject(@Valid Project body);

}
