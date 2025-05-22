package com.generate.toy.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generate.toy.entities.ToyEntity;
import com.generate.toy.projections.ToyProjection;

@Repository
public interface ToyRepository extends JpaRepository<ToyEntity, Long> {
	
	Optional<ToyEntity> findByToyName(String toyName);
	
	@Query("""
		    SELECT 
		        t.toyName AS toyName,
		        t.toyObjective AS toyObjective,
		        t.toyCondition AS toyCondition,
		        t.toyArchiveName AS archiveName,
		        t.toyPrice AS toyPrice,
		        t.toyLikes AS toyLikes,
		        t.toyViews AS toyViews,
		        (t.toyLikes + t.toyViews) AS toyPopularity
		    FROM ToyEntity t
		""")
		List<ToyProjection> findAllWithCalculatedPopularity();
	
	

}