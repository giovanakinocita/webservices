package com.giovanakinocita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanakinocita.course.entities.Category;

// Long pois o ID da classe Category é do tipo Long
public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
