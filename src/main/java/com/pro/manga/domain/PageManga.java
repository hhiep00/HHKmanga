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
@Table(name = "pages")
public class PageManga implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pageId;
	@Column(nullable = false)
	private int numberPage;
	@Column(length=200)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "chapterId")
	private Chapter chapter;

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public int getNumberPage() {
		return numberPage;
	}

	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public PageManga(int pageId, int numberPage, String content, Chapter chapter) {
		this.pageId = pageId;
		this.numberPage = numberPage;
		this.content = content;
		this.chapter = chapter;
	}
	
	public PageManga() {
		
	}
}
