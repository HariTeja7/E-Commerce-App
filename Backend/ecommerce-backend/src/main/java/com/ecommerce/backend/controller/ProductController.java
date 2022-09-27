//package com.ecommerce.backend.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ecommerce.backend.dao.ProductRepository;
//import com.ecommerce.backend.entity.Product;
//
//@RestController
//public class ProductController {
//	
//	@Autowired
//	private ProductRepository productRepository;
//	
//	@RequestMapping("/products")
//	public List<Product> getProduct(){
//		List<Product> list=productRepository.findAll();
//		return list;
//	}
//
//}
