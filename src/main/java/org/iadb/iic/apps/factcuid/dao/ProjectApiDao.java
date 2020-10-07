package org.iadb.iic.apps.factcuid.dao;

import javax.validation.Valid;

import org.iadb.iic.apps.factcuid.model.Project;

public interface ProjectApiDao {

	Project getProject(Integer projId);

	void postProject(@Valid Project body);

}
