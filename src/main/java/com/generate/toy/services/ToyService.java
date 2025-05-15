package com.generate.toy.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generate.toy.dtos.ToyCollectionDTO;
import com.generate.toy.entities.ToyEntity;
import com.generate.toy.repositories.ToyRepository;
import com.generate.toy.utils.MakeUploadAndDownloadArchive;


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
	
	public ToyCollectionDTO updateOneToy(ToyCollectionDTO toy,Long id) throws IOException {
		ToyEntity toyEntity = toyRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
		toyEntity.setToyName(toy.getToyName());
		toyEntity.setToyObjective(toy.getToyObjective());
		
		if(toy.getToyMultipartFile()!=null) {
			
			makeUploadAndDownloadArchive.deleteFile(toyEntity.getToyArchiveName());
			
			makeUploadAndDownloadArchive.saveArchive(toy.getToyMultipartFile(),toyEntity,toyRepository);
		}
		toyEntity.setToyCondition(toy.getToyCondition());
		toyEntity.setToyPrice(toy.getToyPrice());
		toyEntity.setToyLikes(toy.getToyLikes());
		toyEntity.setToyViews(toy.getToyViews());
		toyEntity.setToyPopularity(toy.getToyPopularity());
		toyRepository.save(toyEntity);
			
			
		return new ToyCollectionDTO(toyEntity);	
	}
	public List<ToyCollectionDTO> getAllToys() {
		List<ToyEntity> toyList = toyRepository.findAll();
		List<ToyCollectionDTO> toyDTOList = toyList.stream()
				.map(ToyCollectionDTO::new)
				.toList();
		return toyDTOList;
	}
	
	public String deleteToy(Long id) throws IOException {
		ToyEntity toyEntity = toyRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
		toyRepository.delete(toyEntity);
		makeUploadAndDownloadArchive.deleteFile(toyEntity.getToyArchiveName());
			
		
		return "Brinquedo deletado com sucesso";
	}
	
}
