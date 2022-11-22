package com.example.Category.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Category.Model.Category;
import com.example.Category.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	public CategoryService getCategoryService() {
		return categoryService;
	}
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/Category")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	
	}
	@GetMapping("/Category/{Id}")
	public Category getSingleCategory(@PathVariable int Id) {
		return categoryService.getSingleCategory(Id); 
		
	}
	@PostMapping("/add")
	public Category saveCategory(@RequestBody Category CategoryModel) {
		return categoryService.saveCategory(CategoryModel);
		
	}
	@PutMapping("/Category/{Id}")
	public Category updateCategory(@RequestBody Category CategoryModel,@PathVariable int Id) {
		CategoryModel.setCategory_id(Id);
		return categoryService.updateCategory(CategoryModel);
	}
	@DeleteMapping("/Category/{Id}")
	public ResponseEntity<String> deleteCategory(@PathVariable int Id) {	
			categoryService.deleteCategory(Id);
			return new ResponseEntity<String>("Category removed successfully with Id: "+Id, HttpStatus.OK);
	}

}
