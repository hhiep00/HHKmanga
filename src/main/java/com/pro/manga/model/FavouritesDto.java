package com.pro.manga.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavouritesDto implements Serializable{
	private int favouritesId;
	private int userId;
	private int mangaId;
	public int getFavouritesId() {
		return favouritesId;
	}
	public void setFavouritesId(int favouritesId) {
		this.favouritesId = favouritesId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMangaId() {
		return mangaId;
	}
	public void setMangaId(int mangaId) {
		this.mangaId = mangaId;
	}
	public FavouritesDto(int favouritesId, int userId, int mangaId) {
		this.favouritesId = favouritesId;
		this.userId = userId;
		this.mangaId = mangaId;
	}
	
	public FavouritesDto() {
		
	}
	
	
}
