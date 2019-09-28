package com.example.demo.beans;



public class SocieteBean {
	public SocieteBean() {
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
	public SocieteBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	int id;
	String name;

}
