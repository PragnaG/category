package com.example.Category.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int category_id;
	@Column(name="category_name")
	private String category_name;
	@Column(name="category_description")
	private String category_description;
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_description() {
		return category_description;
	}
	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
//	@Override
//	public String toString() {
//		return "CategoryModel [category_id=" + category_id + ", category_name=" + category_name+ "category_description=" + category_description + "]";
//	}

}
