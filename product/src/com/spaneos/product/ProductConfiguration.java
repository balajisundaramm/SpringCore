/**
 * 
 */
package com.spaneos.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author spaneos
 *
 */
@Configuration
public class ProductConfiguration {
	/**
	 * 
	 * @return
	 */
	@Bean
	public ProductBean getProduct(){
		return new ProductBean();
	}
}