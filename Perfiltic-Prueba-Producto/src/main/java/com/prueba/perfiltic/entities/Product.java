package com.prueba.perfiltic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.prueba.perfiltic.entities.Category;;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String weight;
	private double price_cop;
	private String photo;
	@OneToOne
	private Category category;
	
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public double getPrice_cop() {
		return price_cop;
	}
	public void setPrice_cop(double price_cop) {
		this.price_cop = price_cop;
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
