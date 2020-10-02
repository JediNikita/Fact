package org.iadb.iic.apps.factcuid.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = {"com.yodaplus.controller", "com.yodaplus.yamltest.model", "com.yodaplus.yamltest.service"})
public class FactCUIDApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactCUIDApplication.class, args);
	}
	
}
