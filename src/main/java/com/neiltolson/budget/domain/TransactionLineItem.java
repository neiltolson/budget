package com.neiltolson.budget.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionLineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionLineItemId;
	private Integer transactionId;
	private Integer budgetLineItemId;
	private String description;
	private BigDecimal amount;

	public Integer getTransactionLineItemId() {
		return transactionLineItemId;
	}

	public void setTransactionLineItemId(Integer transactionLineItemId) {
		this.transactionLineItemId = transactionLineItemId;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getBudgetLineItemId() {
		return budgetLineItemId;
	}

	public void setBudgetLineItemId(Integer budgetLineItemId) {
		this.budgetLineItemId = budgetLineItemId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
