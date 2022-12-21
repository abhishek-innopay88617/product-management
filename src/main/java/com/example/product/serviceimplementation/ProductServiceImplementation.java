package com.example.product.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
@Service
public class ProductServiceImplementation implements ProductService{

@Autowired
public ProductRepository repository;
	@Override
	public Product saveProduct(Product product) {
		
		return repository.save(product);
	}

	@Override
	public List<Product> saveProducts(List<Product> products) {
		
		return repository.saveAll(products);
	}

	@Override
	public List<Product> getProducts() {

		return repository.findAll();
	}

	@Override
	public Optional<Product> getProductById(int id) {
	
		return repository.findById(id);
	}

	@Override
	public Product getProductByName(String name) {
	
		return repository.findByName(name);
	}

	@Override
	public String deleteProduct(int id) {
		
		 repository.deleteById(id);
		 return "deleted item successfully with id"+" "+id ;
	}

	@Override
	public Product updateProduct(Product product) {
	
		return repository.save(product);
	}

	@Override
	public String deleteAllProduct() {
	repository.deleteAll();
		return "deleted all products";
	}

}
