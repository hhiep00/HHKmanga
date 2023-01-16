package com.pro.manga.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReadDto implements Serializable{
	private int readId;
	private int userId;
	private int chapterId;
	public int getReadId() {
		return readId;
	}
	public void setReadId(int readId) {
		this.readId = readId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	public ReadDto(int readId, int userId, int chapterId) {
		this.readId = readId;
		this.userId = userId;
		this.chapterId = chapterId;
	}
	
	public ReadDto() {
		
	}
}
