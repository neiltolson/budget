package com.neiltolson.budget.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BugetLineItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer budgetLineItemId;
	private Integer budgetId;
	private Integer categoryId;
	private BigDecimal budgetAmount;
	private String budgetLineItemType;
	private String notes;
	private Integer sortOrder;

	public Integer getBudgetLineItemId() {
		return budgetLineItemId;
	}

	public void setBudgetLineItemId(Integer budgetLineItemId) {
		this.budgetLineItemId = budgetLineItemId;
	}

	public Integer getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(Integer budgetId) {
		this.budgetId = budgetId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public BigDecimal getBudgetAmount() {
		return budgetAmount;
	}

	public void setBudgetAmount(BigDecimal budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

	public String getBudgetLineItemType() {
		return budgetLineItemType;
	}

	public void setBudgetLineItemType(String budgetLineItemType) {
		this.budgetLineItemType = budgetLineItemType;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
