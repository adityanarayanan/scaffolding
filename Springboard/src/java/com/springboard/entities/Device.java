package com.springboard.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "unique_id")
	private String uniqueId;
	
	@Column(name = "type")
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private AppUser owner;
	
	public Device() { }
	
	public Device(String uniqueId, String type, AppUser owner) {
		this.uniqueId = uniqueId;
		this.type = type;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AppUser getOwner() {
		return owner;
	}

	public void setOwner(AppUser owner) {
		this.owner = owner;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null || !(other instanceof Device)) {
			return false;
		}
		if (other == this) {
			return true;
		}
		Device device = (Device) other;
		return id == device.id;
	}
	
	@Override
	public String toString() {
		String description = "\nDevice Entity:" + "\nId: " + id + "\nUnique Identifier: " + uniqueId
				+ "\nDevice Type: " + type + "\n";
		return description;
	}
}
