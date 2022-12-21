//productamanagement
package com.example.product.service;

//productmanagement
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

public interface ProductService {
	
	
	
	public Product saveProduct(Product product);

	public List<Product> saveProducts(List<Product> products);
        //get apis
	public List<Product> getProducts();
	public Optional<Product> getProductById(int id);
	
	public Product getProductByName(String name);

	 public String deleteProduct(int id);
	 
	 public String deleteAllProduct();

	 //update 
	 public Product updateProduct(Product product);

	

}
