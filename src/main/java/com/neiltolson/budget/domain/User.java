package com.neiltolson.budget.domain;

import static com.neiltolson.budget.util.DateUtils.toLocalDateTime;
import static com.neiltolson.budget.util.DateUtils.toTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String emailAddress;
	private Timestamp lastLoginTime;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public LocalDateTime getLastLoginTime() {
		return toLocalDateTime(lastLoginTime);
	}

	public void setLastLoginTime(LocalDateTime lastLoginTime) {
		this.lastLoginTime = toTimestamp(lastLoginTime);
	}

}