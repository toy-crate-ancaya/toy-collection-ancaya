package com.collection.toy.dtos;

import org.springframework.web.multipart.MultipartFile;

import com.collection.toy.entities.ToyEntity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ToyCollectionDTO {
	private Long toyId;
	private String toyName;
	private String toyObjective;
	private MultipartFile toyMultipartFile;
	private String toyCondition;
	private Long toyPrice;
	private Long toyLikes;
	private Long toyViews;
	private Long toyPopularity;
	public ToyCollectionDTO() {
		super();
	}
	public ToyCollectionDTO(Long toyId, String toyName, String toyObjective, MultipartFile toyMultipartFile,
			String toyCondition, Long toyPrice, Long toyLikes, Long toyViews, Long toyPopularity) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
		this.toyObjective = toyObjective;
		this.toyMultipartFile = toyMultipartFile;
		this.toyCondition = toyCondition;
		this.toyPrice = toyPrice;
		this.toyLikes = toyLikes;
		this.toyViews = toyViews;
		this.toyPopularity = toyPopularity;
	}
	
	public ToyCollectionDTO(ToyEntity entity) {
		this.toyId = entity.getToyId();
		this.toyName = entity.getToyName();
		this.toyObjective = entity.getToyObjective();
		this.toyCondition = entity.getToyCondition();
		this.toyPrice = entity.getToyPrice();
		this.toyLikes = entity.getToyLikes();
		this.toyViews = entity.getToyViews();
		this.toyPopularity = entity.getToyPopularity();
	}
	public Long getToyId() {
		return toyId;
	}
	public void setToyId(Long toyId) {
		this.toyId = toyId;
	}
	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public String getToyObjective() {
		return toyObjective;
	}
	public void setToyObjective(String toyObjective) {
		this.toyObjective = toyObjective;
	}
	public MultipartFile getToyMultipartFile() {
		return toyMultipartFile;
	}
	public void setToyMultipartFile(MultipartFile toyMultipartFile) {
		this.toyMultipartFile = toyMultipartFile;
	}
	public String getToyCondition() {
		return toyCondition;
	}
	public void setToyCondition(String toyCondition) {
		this.toyCondition = toyCondition;
	}
	public Long getToyPrice() {
		return toyPrice;
	}
	public void setToyPrice(Long toyPrice) {
		this.toyPrice = toyPrice;
	}
	public Long getToyLikes() {
		return toyLikes;
	}
	public void setToyLikes(Long toyLikes) {
		this.toyLikes = toyLikes;
	}
	public Long getToyViews() {
		return toyViews;
	}
	public void setToyViews(Long toyViews) {
		this.toyViews = toyViews;
	}
	public Long getToyPopularity() {
		return toyPopularity;
	}
	public void setToyPopularity(Long toyPopularity) {
		this.toyPopularity = toyPopularity;
	}
	
	

	
	
	
	
}
