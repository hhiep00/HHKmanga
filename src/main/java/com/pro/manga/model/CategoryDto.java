package com.pro.manga.model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CategoryDto implements Serializable{
	private Long categoryId;
	@NotEmpty
	@Length(min = 3)
	private String name;
	
	private Boolean isEdit=false;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

	public CategoryDto(Long categoryId, @NotEmpty @Length(min = 3) String name, Boolean isEdit) {
		this.categoryId = categoryId;
		this.name = name;
		this.isEdit = isEdit;
	}
	
	public CategoryDto() {
		
	}
	
}
