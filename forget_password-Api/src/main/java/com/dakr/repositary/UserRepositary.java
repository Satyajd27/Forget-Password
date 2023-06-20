package com.dakr.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.entity.User;

public interface UserRepositary extends JpaRepository<User,Long>{

	User findByEmail(String email);
	User findByToken(String token);
	//User findByToken(String token);
	//User findByToken(String token);

}
