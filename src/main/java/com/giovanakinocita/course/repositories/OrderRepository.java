package com.giovanakinocita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanakinocita.course.entities.Order;

// Long pois o ID da classe Order é do tipo Long
public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
