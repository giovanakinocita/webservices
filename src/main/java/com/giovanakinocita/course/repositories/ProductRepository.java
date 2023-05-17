package com.giovanakinocita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanakinocita.course.entities.Product;

// Long pois o ID da classe Product é do tipo Long
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
