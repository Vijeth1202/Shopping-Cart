package com.viju.EcomApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viju.EcomApp.Model.Product;
import com.viju.EcomApp.Repository.ProductRepo;

@Service
public class ProductService {

	
	private ProductRepo repo;
	
	public ProductService(ProductRepo repo)
	{
		this.repo=repo;
	}
	
	
	public List<Product> getProducts() {
		return repo.findAll();
	}

	

}
