package com.pro.manga.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageDto implements Serializable{
	private int pageId;
	private int numberPage;
	private MultipartFile content;
	private int chapterId;
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
	public MultipartFile getContent() {
		return content;
	}
	public void setContent(MultipartFile content) {
		this.content = content;
	}
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	public PageDto(int pageId, int numberPage, MultipartFile content, int chapterId) {
		this.pageId = pageId;
		this.numberPage = numberPage;
		this.content = content;
		this.chapterId = chapterId;
	}
	
	public PageDto() {
		
	}
}
