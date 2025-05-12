package com.collection.toy.entities;

import com.collection.toy.utils.GenericFileManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_toys")
public class ToyEntity implements GenericFileManagement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="toy_id")
	private Long toyId;
	
	@Column(name="toy_name")
	private String toyName;
	
	@Column(name="toy_objective")
	private String toyObjective;
	
	@Column(name="toy_archive_name")
	private String toyArchiveName;
	
	@Column(name="toy_original_name")
	private String toyOriginalName;
	
	@Column(name="toy_archive_path")
	private String toyArchivePath;
	
	@Column(name="toy_archive_type")
	private String toyArchiveType;
	
	@Column(name="toy_condition")
	private String toyCondition;
	
	@Column(name="toy_price")
	private Long toyPrice;
	
	@Column(name="toy_likes")
	private Long toyLikes;
	
	@Column(name="toy_views")
	private Long toyViews;
	
	@Column(name="toy_popularity")
	private Long toyPopularity;

	public ToyEntity() {
		super();
	}

	public ToyEntity(Long toyId, String toyName, String toyObjective, String toyArchiveName, String toyOriginalName,
			String toyArchivePath, String toyArchiveType, String toyCondition, Long toyPrice, Long toyLikes,
			Long toyViews, Long toyPopularity) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
		this.toyObjective = toyObjective;
		this.toyArchiveName = toyArchiveName;
		this.toyOriginalName = toyOriginalName;
		this.toyArchivePath = toyArchivePath;
		this.toyArchiveType = toyArchiveType;
		this.toyCondition = toyCondition;
		this.toyPrice = toyPrice;
		this.toyLikes = toyLikes;
		this.toyViews = toyViews;
		this.toyPopularity = toyPopularity;
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

	public String getToyArchiveName() {
		return toyArchiveName;
	}

	public void setToyArchiveName(String toyArchiveName) {
		this.toyArchiveName = toyArchiveName;
	}

	public String getToyOriginalName() {
		return toyOriginalName;
	}

	public void setToyOriginalName(String toyOriginalName) {
		this.toyOriginalName = toyOriginalName;
	}

	public String getToyArchivePath() {
		return toyArchivePath;
	}

	public void setToyArchivePath(String toyArchivePath) {
		this.toyArchivePath = toyArchivePath;
	}

	public String getToyArchiveType() {
		return toyArchiveType;
	}

	public void setToyArchiveType(String toyArchiveType) {
		this.toyArchiveType = toyArchiveType;
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
