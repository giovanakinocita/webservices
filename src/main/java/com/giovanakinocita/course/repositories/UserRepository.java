package com.giovanakinocita.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanakinocita.course.entities.User;

// Long pois o ID da classe User é do tipo Long
public interface UserRepository extends JpaRepository<User, Long> {
	

}
