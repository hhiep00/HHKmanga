package com.pro.manga.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChapterDto implements Serializable{
	private int chapterId;
	private int chapterNumber;
	private int numberOfPages;
	private int mangaId;
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
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
	public int getMangaId() {
		return mangaId;
	}
	public void setMangaId(int mangaId) {
		this.mangaId = mangaId;
	}
	public ChapterDto(int chapterId, int chapterNumber, int numberOfPages, int mangaId) {
		this.chapterId = chapterId;
		this.chapterNumber = chapterNumber;
		this.numberOfPages = numberOfPages;
		this.mangaId = mangaId;
	}
	
	public ChapterDto() {
		
	}
	
	
}
