package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/myapi")//localhost:8080/myapi/
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/products") //localhost:8080/myapi/products
	public List<ProductEntity> getAll(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{id}") //localhost:8080/myapi/products/{id}
	public ProductEntity getProById(@PathVariable("id") int id) {
		
		return productService.getProductsByID(id);
	}
	
	@PostMapping("/products")//localhost:8080/myapi/product
	public void addNewProduct(@RequestBody ProductEntity object ) {
		
		productService.addProduct(object);
		
	}
	
	@PutMapping("/products/{id}") //localhost:8080/myapi/products/{id}
	public void updateProduct(@PathVariable("id") int id, @RequestBody ProductEntity entity) {
		
		productService.updateProduct(id, entity);
		
	}
	
	@DeleteMapping("/products/{id}") //localhost:8080/myapi/products/{id}
	public void deleteProduct(@PathVariable("id") int id) {
		
		productService.deleteProduct(id);
		
	}
	
	

}