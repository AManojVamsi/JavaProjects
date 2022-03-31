package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public List<ProductEntity> getAllProducts(){
		
		return productRepo.findAll();
	}
	
	
	public ProductEntity getProductsByID(int id) {
		
		return productRepo.findById(id).get();
	}
	
	public void addProduct (ProductEntity object) {
		productRepo.save(object);
	}
	
	public void updateProduct (int id, ProductEntity entity) {
		
		if(productRepo.findById(id).isPresent()) {
			
			ProductEntity old= productRepo.findById(id).get();
			old.setName(entity.getName());
			old.setDescription(entity.getDescription());
			productRepo.save(old);
			
		}
		else {
			
			System.out.println("Product not found");
		}
		
	}
	
	public void deleteProduct(int id) {
		
		productRepo.deleteById(id);
	}

}