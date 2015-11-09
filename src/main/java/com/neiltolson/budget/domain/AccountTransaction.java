package com.neiltolson.budget.domain;

import static com.neiltolson.budget.util.DateUtils.toLocalDate;
import static com.neiltolson.budget.util.DateUtils.toSqlDate;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountTransactionId;

	private Integer accountId;
	private Date transactionDate;
	private String transactionType;
	private String description;
	private BigDecimal amount;
	private String notes;
	private String checkNumber;
	private Integer transferTransactionId;
	private Date reconciledDate;

	public Integer getAccountTransactionId() {
		return accountTransactionId;
	}

	public void setAccountTransactionId(Integer transactionId) {
		this.accountTransactionId = transactionId;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public LocalDate getTransactionDate() {
		return toLocalDate(transactionDate);
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = toSqlDate(transactionDate);
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public Integer getTransferTransactionId() {
		return transferTransactionId;
	}

	public void setTransferTransactionId(Integer transferTransactionId) {
		this.transferTransactionId = transferTransactionId;
	}

	public LocalDate getReconciledDate() {
		return toLocalDate(reconciledDate);
	}

	public void setReconciledDate(LocalDate reconciledDate) {
		this.reconciledDate = toSqlDate(reconciledDate);
	}

}
