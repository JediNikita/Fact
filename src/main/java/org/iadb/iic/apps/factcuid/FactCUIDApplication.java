package org.iadb.iic.apps.factcuid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = {"org.iadb.iic.apps.factcuid.controller", "org.iadb.iic.apps.factcuid.model", "org.iadb.iic.apps.factcuid.service"
		, "org.iadb.iic.apps.factcuid.dao", "org.iadb.iic.apps.factcuid.config"})
public class FactCUIDApplication {

	@Value("${connectionString}")
	private String connectionString; 
	
	public static void main(String[] args) {
		SpringApplication.run(FactCUIDApplication.class, args);
	}
	
}
