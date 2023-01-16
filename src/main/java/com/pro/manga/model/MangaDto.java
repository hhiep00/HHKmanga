package com.pro.manga.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MangaDto implements Serializable{
	private Long mangaId;
	private String name;
	private String image;
	private MultipartFile imageFile;
	
	private String authur;
	private int numberOfChapters;
	private String status;
	private String description;
	private int likes;
	
	private Boolean isEdit=false;

	public Long getMangaId() {
		return mangaId;
	}

	public void setMangaId(Long mangaId) {
		this.mangaId = mangaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public String getAuthur() {
		return authur;
	}

	public void setAuthur(String authur) {
		this.authur = authur;
	}

	public int getNumberOfChapters() {
		return numberOfChapters;
	}

	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

	public MangaDto(Long mangaId, String name, String image, MultipartFile imageFile, String authur,
			int numberOfChapters, String status, String description, int likes, Boolean isEdit) {
		this.mangaId = mangaId;
		this.name = name;
		this.image = image;
		this.imageFile = imageFile;
		this.authur = authur;
		this.numberOfChapters = numberOfChapters;
		this.status = status;
		this.description = description;
		this.likes = likes;
		this.isEdit = isEdit;
	}
	
	public MangaDto() {
		
	}
	
	
}
