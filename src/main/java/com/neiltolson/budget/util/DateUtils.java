package com.neiltolson.budget.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public final class DateUtils {

	public static Date toSqlDate(LocalDate date) {
		return date == null ? null : Date.valueOf(date);
	}
	
	public static LocalDate toLocalDate(Date date) {
		return date == null ? null : date.toLocalDate();
	}
	
	public static Timestamp toTimestamp(LocalDateTime time) {
		return time == null ? null : Timestamp.valueOf(time);
	}
	
	public static LocalDateTime toLocalDateTime(Timestamp time) {
		return time == null ? null : time.toLocalDateTime();
	}
}
