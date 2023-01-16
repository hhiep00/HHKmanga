package com.pro.manga.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="favourites")
public class Favourite implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int favouritesId;
	
	@ManyToOne
	@JoinColumn(name = "mangaId")
	private Manga manga;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public int getFavouritesId() {
		return favouritesId;
	}

	public void setFavouritesId(int favouritesId) {
		this.favouritesId = favouritesId;
	}

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Favourite( Manga manga, User user) {
		this.manga = manga;
		this.user = user;
	}
	
	public Favourite() {
		
	}
	
	
}
