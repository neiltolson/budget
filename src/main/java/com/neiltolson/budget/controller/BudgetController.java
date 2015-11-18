package com.neiltolson.budget.controller;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neiltolson.budget.controller.model.BudgetModel;
import com.neiltolson.budget.controller.model.BudgetModel.Amounts;
import com.neiltolson.budget.controller.model.BudgetModel.CategoryGroupAmounts;

@RestController
public class BudgetController {
	
	private Log log = LogFactory.getLog(this.getClass());

	@RequestMapping("/rest/budget")
	public BudgetModel getDefaultBudget() {
		log.info("getting default budget");
		return createTestBudgetModel();
	}
	
	private BudgetModel createTestBudgetModel() {
		BudgetModel model = new BudgetModel();
		model.setCarryOver(createAmounts("Carry Over", "101.00"));
		model.setIncome(createAmounts("Income", "202.00"));
		model.setTotalExpenses(createAmounts("Total Expenses", "808.00"));
		model.setBalance(createAmounts("Balance", "909.00"));
		model.setTimeDesc("Jan 2015");
		ArrayList<CategoryGroupAmounts> expenses = new ArrayList<BudgetModel.CategoryGroupAmounts>();
		model.setExpenses(expenses);
		
		CategoryGroupAmounts cga; 
		
		cga = createCategoryGroupAmounts("Charity");
		cga.getCategories().add(createAmounts("Tithes", "303.00"));
		cga.getCategories().add(createAmounts("Charity & Other Offerings", "404.00"));
		expenses.add(cga);

		cga = createCategoryGroupAmounts("Savings");
		cga.getCategories().add(createAmounts("Emergency Fund", "505.00"));
		cga.getCategories().add(createAmounts("Retirement", "606.00"));
		expenses.add(cga);
		
		return model;
	}
	
	private Amounts createAmounts(String name, String amt) {
		Amounts a = new Amounts();
		a.setName(name);
		a.setBudget(new BigDecimal(amt));
		a.setActual(new BigDecimal(amt));
		a.setPrevBudget(new BigDecimal(amt));
		a.setPrevActual(new BigDecimal(amt));
		return a;
	}
	
	private CategoryGroupAmounts createCategoryGroupAmounts(String group ) {
		CategoryGroupAmounts cga = new CategoryGroupAmounts();
		cga.setGroup(group);
		cga.setCategories(new ArrayList<Amounts>());
		return cga;
	}
}
