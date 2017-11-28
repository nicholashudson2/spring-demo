package com.example.demo.dto;

import java.sql.Timestamp;

import com.example.demo.entity.Client;
import com.fasterxml.jackson.annotation.JsonFormat;

public class TweetDto {

	private long id;
	
	@JsonFormat(pattern="MM-dd-yy HH:mm")
	private Timestamp created;

	private String content;

	private boolean active;

	private Client author;

	public void setCreated(Timestamp created) {
		this.created = created;
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
		TweetDto other = (TweetDto) obj;
		if (id != other.id)
			return false;
		return true;
	}
}