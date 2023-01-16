package com.pro.manga.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable{
	private int userId;
	@NotEmpty
	@Length(min = 3)
	private String username;
	@NotEmpty
	@Length(min = 6)
	private String password;
	private Boolean sex;
	@NotEmpty
	@Length(min = 6)
	private String email;
	private Boolean isAdmin;
	private Date registerDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public UserDto(int userId, @NotEmpty @Length(min = 6) String username, @NotEmpty @Length(min = 6) String password,
			Boolean sex, @NotEmpty @Length(min = 6) String email, Boolean isAdmin, Date registerDate) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.isAdmin = isAdmin;
		this.registerDate = registerDate;
	}
	
	public UserDto() {
		
	}
}
