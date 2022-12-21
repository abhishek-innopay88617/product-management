//productmanagement
package com.example.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where name=?1")     
	Product findByName(String name);
  
    @Query("delete from Product  where name=?1") 
	Product deleteByName(String name);

	
	
}
