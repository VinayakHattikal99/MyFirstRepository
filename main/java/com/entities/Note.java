package com.entities;

import java.util.Date;

import jakarta.persistence.Column;

//import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notes")
public class Note {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@Column(length = 1000)
	private String content;
	private Date adddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAdddate() {
		return adddate;
	}
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}
	
	public Note(String title, String content, Date adddate) {
		super();
		//this.id = id;
		this.title = title;
		this.content = content;
		this.adddate = adddate;
	}
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
