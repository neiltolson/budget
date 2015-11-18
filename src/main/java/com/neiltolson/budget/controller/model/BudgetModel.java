package com.neiltolson.budget.controller.model;

import java.math.BigDecimal;
import java.util.List;

public class BudgetModel {

	private String timeDesc;
	private Amounts carryOver;
	private Amounts income;
	private Amounts totalExpenses;
	private Amounts balance;
	private List<CategoryGroupAmounts> expenses;

	public String getTimeDesc() {
		return timeDesc;
	}

	public void setTimeDesc(String timeDesc) {
		this.timeDesc = timeDesc;
	}

	public Amounts getCarryOver() {
		return carryOver;
	}

	public void setCarryOver(Amounts carryOver) {
		this.carryOver = carryOver;
	}

	public Amounts getIncome() {
		return income;
	}

	public void setIncome(Amounts income) {
		this.income = income;
	}

	public Amounts getTotalExpenses() {
		return totalExpenses;
	}

	public void setTotalExpenses(Amounts totalExpenses) {
		this.totalExpenses = totalExpenses;
	}

	public Amounts getBalance() {
		return balance;
	}

	public void setBalance(Amounts balance) {
		this.balance = balance;
	}

	public List<CategoryGroupAmounts> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<CategoryGroupAmounts> expenses) {
		this.expenses = expenses;
	}

	public static class CategoryGroupAmounts {
		private String group;
		private List<Amounts> categories;

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public List<Amounts> getCategories() {
			return categories;
		}

		public void setCategories(List<Amounts> categories) {
			this.categories = categories;
		}
	}

	public static class Amounts {
		private String name;
		private BigDecimal budget;
		private BigDecimal actual;
		private BigDecimal prevBudget;
		private BigDecimal prevActual;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getBudget() {
			return budget;
		}

		public void setBudget(BigDecimal budget) {
			this.budget = budget;
		}

		public BigDecimal getActual() {
			return actual;
		}

		public void setActual(BigDecimal actual) {
			this.actual = actual;
		}

		public BigDecimal getPrevBudget() {
			return prevBudget;
		}

		public void setPrevBudget(BigDecimal prevBudget) {
			this.prevBudget = prevBudget;
		}

		public BigDecimal getPrevActual() {
			return prevActual;
		}

		public void setPrevActual(BigDecimal prevActual) {
			this.prevActual = prevActual;
		}
	}
}
