package com.neiltolson.budget.domain;

import static com.neiltolson.budget.util.DateUtils.toLocalDate;
import static com.neiltolson.budget.util.DateUtils.toLocalDateTime;
import static com.neiltolson.budget.util.DateUtils.toSqlDate;
import static com.neiltolson.budget.util.DateUtils.toTimestamp;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer budgetId;
	private Integer userId;
	private String name;
	private Date startDate;
	private Date endDate;
	private Timestamp lastUpdated;
	private String status;

	public Integer getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(Integer budgetId) {
		this.budgetId = budgetId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return toLocalDate(startDate);
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = toSqlDate(startDate);
	}

	public LocalDate getEndDate() {
		return toLocalDate(endDate);
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = toSqlDate(endDate);
	}

	public LocalDateTime getLastUpdated() {
		return toLocalDateTime(lastUpdated);
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = toTimestamp(lastUpdated);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
