package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	@Query(value = "SELECT p.productName FROM Product p JOIN OrderDetail od ON p.productCode = od.productCode WHERE od.quantityOrdered = (SELECT MAX(quantityOrdered) FROM OrderDetail)")
	public String findProductWithHighestQuantityOrdered();

}
