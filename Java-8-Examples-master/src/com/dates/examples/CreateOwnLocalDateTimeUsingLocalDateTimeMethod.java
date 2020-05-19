package com.dates.examples;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CreateOwnLocalDateTimeUsingLocalDateTimeMethod {

	public static void main(String[] args) {

		
		LocalDateTime createOwnDateTime1 = LocalDateTime.of(2018, Month.OCTOBER, 22, 12, 9, 22);
		System.out.println("createOwnDateTime1: " + createOwnDateTime1);
		
		
		String dateString = "2018-10-22T12:09:22";
		LocalDateTime createOwnDateTime2 = LocalDateTime.parse(dateString);
		System.out.println("createOwnDateTime2: " + createOwnDateTime2);
		
		String str1 = "2018-10-22 12:30:22";
	
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDateTime localDateTime1 = LocalDateTime.parse(str1, dateTimeFormatter1);
		System.out.println("\n\nlocalDateTime1: " + localDateTime1);
		
		
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, 10, 22, 12, 36, 22);
		String formatLocalDateTimeInString = localDateTime2.format(dateTimeFormatter2);
		System.out.println("formatLocalDateTimeInString: " + formatLocalDateTimeInString);
	}

}
