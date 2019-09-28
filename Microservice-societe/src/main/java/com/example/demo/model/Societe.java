package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Societe {
	public Societe() {
		super();
	}
	@Override
	public String toString() {
		return "Societe [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Societe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id
	int id;
	String name;

}
