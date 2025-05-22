package com.generate.toy.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generate.toy.dtos.ToyCollectionDTO;
import com.generate.toy.entities.ToyEntity;
import com.generate.toy.mappers.ToyMapper;
import com.generate.toy.repositories.ToyRepository;
import com.generate.toy.utils.MakeUploadAndDownloadArchive;


@Service
public class ToyService {
	
	//<-- caio<- aqui vamos implementar os métodos de CRUD
	
	@Autowired
	private ToyRepository toyRepository;
	
	@Autowired
	private MakeUploadAndDownloadArchive makeUploadAndDownloadArchive;
	
	@Autowired
	private ToyMapper toyMapper;
	
	public ToyCollectionDTO createToy(ToyCollectionDTO toy) throws IOException,Exception {
		Optional<ToyEntity> findExistentToy = toyRepository.findByToyName(toy.getToyName());
		
		if(findExistentToy.isPresent() ) {
			throw new Exception("Esse brinquedo já existe");
		}
		
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
	
	public ToyCollectionDTO updateOneToy(ToyCollectionDTO toy,Long id,Boolean isLike, Boolean isUnlike,Boolean isView) throws IOException {
		ToyEntity toyEntity = toyRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
		if(!toy.getToyName().isEmpty()) {
		toyEntity.setToyName(toy.getToyName());
		}
		if(!toy.getToyObjective().isEmpty()) {
		toyEntity.setToyObjective(toy.getToyObjective());
		}
		
		if (toy.getToyMultipartFile() != null && !toy.getToyMultipartFile().isEmpty()) {
		    makeUploadAndDownloadArchive.deleteFile(toyEntity.getToyArchiveName());
		    

		    makeUploadAndDownloadArchive.saveArchive(toy.getToyMultipartFile(), toyEntity, toyRepository);
		}
		toyEntity.setToyCondition(toy.getToyCondition());
		toyEntity.setToyPrice(toy.getToyPrice());
		
		
	    if (isLike) {
	        toyEntity.setToyLikes(toyEntity.getToyLikes() + 1);
	    } else if (isUnlike) {
	        toyEntity.setToyLikes(Math.max(0, toyEntity.getToyLikes() - 1)); 
	    }

	  
	    if (isView) {
	        toyEntity.setToyViews(toyEntity.getToyViews() + 1);
	    }

	    // Recalcula popularidade
	    toyEntity.setToyPopularity(toyEntity.getToyLikes() + toyEntity.getToyViews());
		toyRepository.save(toyEntity);
			
			
		return new ToyCollectionDTO(toyEntity);	
	}
	public List<ToyCollectionDTO> getAllToys() {
		List<ToyCollectionDTO> toyList = toyRepository.findAllWithCalculatedPopularity().stream()
				.map(p->toyMapper.toToyCollectionDTO(p))
				.toList();;

		return toyList;
	}
	
	public String deleteToy(Long id) throws IOException {
		ToyEntity toyEntity = toyRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
		toyRepository.delete(toyEntity);
		makeUploadAndDownloadArchive.deleteFile(toyEntity.getToyArchiveName());
			
		
		return "Brinquedo deletado com sucesso";
	}
	
}
