package com.pro.manga.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="chapters")
public class Chapter implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long chapterId;
	@Column(nullable = false)
	private int chapterNumber;
	@Column(nullable = false)
	private int numberOfPages;
	
	@ManyToOne
	@JoinColumn(name = "mangaId")
	private Manga manga;
	
	@OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
	private Set<PageManga> pages;
	
	@OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
	private Set<Read>  reads;

	public Long getChapterId() {
		return chapterId;
	}

	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
	}

	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public Set<PageManga> getPages() {
		return pages;
	}

	public void setPages(Set<PageManga> pages) {
		this.pages = pages;
	}

	public Set<Read> getReads() {
		return reads;
	}

	public void setReads(Set<Read> reads) {
		this.reads = reads;
	}

	public Chapter( int chapterNumber, int numberOfPages, Manga manga, Set<PageManga> pages,
			Set<Read> reads) {
		this.chapterNumber = chapterNumber;
		this.numberOfPages = numberOfPages;
		this.manga = manga;
		this.pages = pages;
		this.reads = reads;
	}
	
	public Chapter() {
		
	}
	
}
