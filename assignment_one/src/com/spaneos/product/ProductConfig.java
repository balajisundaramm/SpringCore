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
public class ProductConfig {
	@Bean
	public Product product(){
		return new Product();
	}

}
