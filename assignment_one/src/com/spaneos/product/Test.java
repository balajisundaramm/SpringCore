/**
 * 
 */
package com.spaneos.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author spaneos
 *
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("product.xml");
		Product product=(Product)context.getBean("product");
		System.out.println(product);
	}
}
