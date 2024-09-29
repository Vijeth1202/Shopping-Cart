package com.viju.EcomApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viju.EcomApp.Model.Product;
import com.viju.EcomApp.Service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
	
	
	
	private ProductService service;
	//Constructor Injection
	public ProductController(ProductService service)
	{
		this.service=service;
	}
		
	@RequestMapping("/")
	public String wish()
	{
		return "Hello Vijeth";
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return service.getProducts();
		
	}
}
