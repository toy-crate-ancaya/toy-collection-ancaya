package com.generate.toy.mappers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.generate.toy.dtos.ToyCollectionDTO;
import com.generate.toy.projections.ToyProjection;

@Component
public class ToyMapper {
	
	public ToyCollectionDTO toToyCollectionDTO(ToyProjection p) {
		ToyCollectionDTO toyCollectionDTO = new ToyCollectionDTO();
		toyCollectionDTO.setToyName(p.getToyName());
		toyCollectionDTO.setToyObjective(p.getToyObjective());
		toyCollectionDTO.setToyCondition(p.getToyCondition());
		toyCollectionDTO.setToyFileUrl(ServletUriComponentsBuilder
	                .fromCurrentContextPath()
	                .path("/file/read/")         
	                .path(p.getArchiveName())
	                .toUriString());
		toyCollectionDTO.setToyPrice(p.getToyPrice());
		toyCollectionDTO.setToyLikes(p.getToyLikes());
		toyCollectionDTO.setToyViews(p.getToyViews());
		toyCollectionDTO.setToyPopularity(p.getToyPopularity());
		return toyCollectionDTO;
	}
}
