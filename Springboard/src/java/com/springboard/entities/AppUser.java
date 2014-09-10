package com.springboard.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "appusers")
public class AppUser {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@OneToMany(mappedBy = "appusers")
	private Set<Device> devices;
	
	public AppUser() { }
	
	public AppUser(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Device> getDevices() {
		return devices;
	}

	public void setDevices(Set<Device> devices) {
		this.devices = devices;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null || !(other instanceof AppUser)) {
			return false;
		}
		if (other == this) {
			return true;
		}
		AppUser user = (AppUser) other;
		return id == user.id;
	}
	
	@Override
	public String toString() {
		String description = "\nAppUser Entity:" + "\nId: " + id + "\nEmail: " + email
				+ "\nPassword: " + password + "\n";
		return description;
	}

}
