package com.spaneos.db_connection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author balaji
 *
 */
@PropertySource("classpath:dbConnection.properties")
@Component
@Configuration

public class DbConfiguration {

	@Resource
	Environment environment;

	@Bean(name = "dbConnection")
	public DbConnectionUtill getDbConnction() {
		DbConnectionUtill connection = new DbConnectionUtill();
		connection.setDriverName(environment.getProperty("DRIVER_Name"));
		connection.setUserId(environment.getProperty("USER_ID"));
		connection.setUrl(environment.getProperty("URL"));
		connection.setPassword(environment.getProperty("PASSWORD"));
		return connection;
	}
}
