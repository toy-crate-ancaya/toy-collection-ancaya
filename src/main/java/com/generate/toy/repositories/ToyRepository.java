package com.generate.toy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generate.toy.entities.ToyEntity;

@Repository
public interface ToyRepository extends JpaRepository<ToyEntity, Long> {
	

	
	

}