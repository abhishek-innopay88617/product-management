//productmanagement
package com.example.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import com.example.product.serviceimplementation.ProductServiceImplementation;
@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceImplementation service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addproducts(@RequestBody List<Product> products){
		return service.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
		
	}
	@GetMapping("/product/{id}")
	public Optional<Product> findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	
	@GetMapping("/productbyname/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	//put
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	//delete
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);

}
	@DeleteMapping("/deleteAll")
	public String deleteAllProduct() {
		return service.deleteAllProduct();
		
	}

}
