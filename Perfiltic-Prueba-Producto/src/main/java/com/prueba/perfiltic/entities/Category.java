package com.prueba.perfiltic.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String photo;
	
	@OneToOne
	@JoinColumn(name="CATEGORY_FATHER", referencedColumnName = "ID")
	private Category category_father;
	
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Category getCategory_father() {
		return category_father;
	}
	public void setCategory_father(Category category_father) {
		this.category_father = category_father;
	}
	
}
