package com.coderef.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderef.delivery.model.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
}
