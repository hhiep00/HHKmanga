package com.pro.manga.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(length = 30, nullable = false)
	private String username;
	@Column(length = 100, nullable = false)
	private String password;
	@Column(nullable = false)
	private Boolean sex;
	private String email;
	@Column(nullable = false)
	private Boolean isAdmin;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Favourite> favourites;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Read> reads;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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

	public Set<Favourite> getFavourites() {
		return favourites;
	}

	public void setFavourites(Set<Favourite> favourites) {
		this.favourites = favourites;
	}

	public Set<Read> getReads() {
		return reads;
	}

	public void setReads(Set<Read> reads) {
		this.reads = reads;
	}

	public User(String username, String password, Boolean sex, String email, Boolean isAdmin,
			Set<Favourite> favourites, Set<Read> reads) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.isAdmin = isAdmin;
		this.favourites = favourites;
		this.reads = reads;
	}
	
	public User() {
		
	}
}
