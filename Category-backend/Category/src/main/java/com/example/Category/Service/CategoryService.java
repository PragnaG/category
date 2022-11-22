package com.example.Category.Service;

import java.util.List;
import com.example.Category.Model.Category;


public interface CategoryService {
	List<Category> getAllCategory();
	 
	Category getSingleCategory(int Id);
	 
	Category saveCategory(Category CategoryModel);
	 
	Category updateCategory(Category CategoryModel);

	void deleteCategory(int id);	

}
