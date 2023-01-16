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


@Entity
@Table(name = "read_manga")
public class Read implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long readId;
	
	@ManyToOne
	@JoinColumn(name = "chapterId")
	private Chapter chapter;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public Long getReadId() {
		return readId;
	}

	public void setReadId(Long readId) {
		this.readId = readId;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Read(Long readId, Chapter chapter, User user) {
		this.readId = readId;
		this.chapter = chapter;
		this.user = user;
	}
	
	public Read() {
		
	}
}
