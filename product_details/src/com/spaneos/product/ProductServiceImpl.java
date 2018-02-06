/**
 * 
 */
package com.spaneos.product;

import org.springframework.stereotype.Component;

/**
 * @author balaji
 *
 */
@Component
public class ProductServiceImpl implements ProductService{
	
	public ProductServiceImpl() {
		System.out.println("Service impl");
	}

	public String getProductDetails(ProductBean bean) {
		System.out.println("Service impl--> getProductDetails()");
		return bean.toString();
	}
}
