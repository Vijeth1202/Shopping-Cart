package com.viju.EcomApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viju.EcomApp.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
