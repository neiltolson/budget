package com.neiltolson.budget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPrefs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userPrefsId;
	private Integer userId;
	private String key;
	private String value;

	public Integer getUserPrefsId() {
		return userPrefsId;
	}

	public void setUserPrefsId(Integer userPrefsId) {
		this.userPrefsId = userPrefsId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
