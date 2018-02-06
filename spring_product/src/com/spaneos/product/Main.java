/**
 * 
 */
package com.spaneos.product;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author spaneos
 *
 */
public class Main {
	public static void main(String[] args) {
		//System.out.println("Exist test: " + new File("src/com/spaneos/product/spring.xml").exists());

		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		ProductBean bean = (ProductBean) context.getBean("product");
		System.out.println(bean);
		System.out.println("context " + context);

	}
}
