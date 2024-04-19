package com.example.loginDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginDemo.Entity.UserDtls;

@Repository
public interface UserRepository extends JpaRepository<UserDtls,Integer> {
		
}
