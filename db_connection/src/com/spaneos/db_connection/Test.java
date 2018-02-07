/**
 * 
 */
package com.spaneos.db_connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author spaneos
 *
 */
public class Test {

	@Autowired
	DbConfiguration dbConfiguration;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spaneos");
		DbConnectionUtill connection = (DbConnectionUtill) context.getBean("dbConnection");
		System.out.println(connection.getConnection());
	}
}
