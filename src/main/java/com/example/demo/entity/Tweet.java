package com.example.demo.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Tweet {

	@Transient
	java.util.Date today = new java.util.Date();
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private final Timestamp created = new java.sql.Timestamp(today.getTime());
	
	private String content;
	
	private boolean active;
	
	@ManyToOne
	private Client author;

	
	public Tweet() {
		super();
	}

	public Tweet(Date today, long id, boolean active, String content, Client author) {
		super();
		this.today = today;
		this.id = id;
		this.active = active;
		this.content = content;
		this.author = author;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCreated() {
		return created;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Client getAuthor() {
		return author;
	}

	public void setAuthor(Client author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tweet other = (Tweet) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
