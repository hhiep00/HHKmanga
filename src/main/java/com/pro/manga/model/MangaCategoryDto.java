package com.pro.manga.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MangaCategoryDto implements Serializable{
	private Long mangaCategoryId;
	private Long categoryId;
	private Long mangaId;
	public Long getMangaCategoryId() {
		return mangaCategoryId;
	}
	public void setMangaCategoryId(Long mangaCategoryId) {
		this.mangaCategoryId = mangaCategoryId;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getMangaId() {
		return mangaId;
	}
	public void setMangaId(Long mangaId) {
		this.mangaId = mangaId;
	}
	public MangaCategoryDto(Long mangaCategoryId, Long categoryId, Long mangaId) {
		this.mangaCategoryId = mangaCategoryId;
		this.categoryId = categoryId;
		this.mangaId = mangaId;
	}
	
	public MangaCategoryDto() {
		
	}
}
