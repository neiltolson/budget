package com.neiltolson.budget.domain;

import static com.neiltolson.budget.util.DateUtils.toLocalDate;
import static com.neiltolson.budget.util.DateUtils.toLocalDateTime;
import static com.neiltolson.budget.util.DateUtils.toSqlDate;
import static com.neiltolson.budget.util.DateUtils.toTimestamp;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;

	private Integer userId;
	private String accountType;
	private String name;
	private String subAccountName;
	private Date startDate;
	private Date endDate;
	private Timestamp lastUpdated;
	private String status;
	private String notes;
	private BigDecimal beginningBlance;

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubAccountName() {
		return subAccountName;
	}

	public void setSubAccountName(String subAccountName) {
		this.subAccountName = subAccountName;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public BigDecimal getBeginningBlance() {
		return beginningBlance;
	}

	public void setBeginningBlance(BigDecimal beginningBlance) {
		this.beginningBlance = beginningBlance;
	}
}
