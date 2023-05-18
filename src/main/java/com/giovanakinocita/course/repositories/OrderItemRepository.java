package com.giovanakinocita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanakinocita.course.entities.OrderItem;

// Long pois o ID da classe OrderItem é do tipo Long
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
