package com.crudPerson.models;

public class Person {
	
	
	private int id;
	private String name;
	private String description;
	private String CIN;
	
	public Person() {
		
	}
	
	public  Person(int id, String name,String description,String CIN  ) {
		
		 this.id=id;
		 this.name=name;
		 this.description=description;
		 this.CIN=CIN;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCIN() {
		return CIN;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", description=" + description + ", CIN=" + CIN + "]";
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}

}
