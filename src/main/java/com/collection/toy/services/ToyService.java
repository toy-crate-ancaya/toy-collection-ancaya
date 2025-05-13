package com.collection.toy.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collection.toy.dtos.ToyCollectionDTO;
import com.collection.toy.entities.ToyEntity;
import com.collection.toy.repositories.ToyRepository;
import com.collection.toy.utils.MakeUploadAndDownloadArchive;

@Service
public class ToyService {
	
	//<-- caio<- aqui vamos implementar os métodos de CRUD
	
	@Autowired
	private ToyRepository toyRepository;
	
	@Autowired
	private MakeUploadAndDownloadArchive makeUploadAndDownloadArchive;
	
	public ToyCollectionDTO createToy(ToyCollectionDTO toy) throws IOException {
		ToyEntity toyEntity = new ToyEntity();
		toyEntity.setToyName(toy.getToyName());
		toyEntity.setToyObjective(toy.getToyObjective());
		makeUploadAndDownloadArchive.saveArchive(toy.getToyMultipartFile(),toyEntity, toyRepository);
		toyEntity.setToyCondition(toy.getToyCondition());
		toyEntity.setToyPrice(toy.getToyPrice());
		toyEntity.setToyLikes(toy.getToyLikes());
		toyEntity.setToyViews(toy.getToyViews());
		toyEntity.setToyPopularity(toy.getToyPopularity());
		
		ToyEntity response =  toyRepository.save(toyEntity);
		
		return new ToyCollectionDTO(response);
	}
	
	public ToyCollectionDTO updateOneToy(Long id) {
		ToyEntity toyEntity = toyRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
		toyEntity.setToyName(toyEntity.getToyName());
		toyEntity.setToyObjective(toyEntity.getToyObjective());
		toyEntity.setToyCondition(toyEntity.getToyCondition());
		toyEntity.setToyPrice(toyEntity.getToyPrice());
		toyEntity.setToyLikes(toyEntity.getToyLikes());
		toyEntity.setToyViews(toyEntity.getToyViews());
		toyEntity.setToyPopularity(toyEntity.getToyPopularity());
		toyRepository.save(toyEntity);
			
			
		return null;
	}
	
}
