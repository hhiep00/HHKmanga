package com.pro.manga.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "mangas")
public class Manga implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mangaId;
	@Column(columnDefinition = "nvarchar(100) not null")
	private String name;
	@Column(length=200)
	private String image;
	@Column(columnDefinition = "nvarchar(100) not null")
	private String authur;
	@Column(nullable = false)
	private int numberOfChapters;
	@Column(nullable = false)
	private String status;
	@Column(columnDefinition = "nvarchar(500) not null")
	private String description;
	@Column(nullable = false)
	private int likes;
	
	@OneToMany(mappedBy = "manga", cascade = CascadeType.ALL)
	private Set<MangaCategory> mangaCategories;
	
	@OneToMany(mappedBy = "manga", cascade =CascadeType.ALL)
	private Set<Chapter> chapters;
	
	@OneToMany(mappedBy = "manga", cascade = CascadeType.ALL)
	private Set<Favourite> favourites;

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

	public Set<MangaCategory> getMangaCategories() {
		return mangaCategories;
	}

	public void setMangaCategories(Set<MangaCategory> mangaCategories) {
		this.mangaCategories = mangaCategories;
	}

	public Set<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapter> chapters) {
		this.chapters = chapters;
	}

	public Set<Favourite> getFavourites() {
		return favourites;
	}

	public void setFavourites(Set<Favourite> favourites) {
		this.favourites = favourites;
	}

	public Manga(String name, String image, String authur, int numberOfChapters, String status,
			String description, int likes, Set<MangaCategory> mangaCategories, Set<Chapter> chapters,
			Set<Favourite> favourites) {
		this.name = name;
		this.image = image;
		this.authur = authur;
		this.numberOfChapters = numberOfChapters;
		this.status = status;
		this.description = description;
		this.likes = likes;
		this.mangaCategories = mangaCategories;
		this.chapters = chapters;
		this.favourites = favourites;
	}
	
	public Manga() {
		
	}
	
	
}
