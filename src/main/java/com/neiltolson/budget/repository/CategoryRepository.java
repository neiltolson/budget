package com.neiltolson.budget.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.neiltolson.budget.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

	public List<Category> findByCatGroup(String catGroup);
}
