package com.dates.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ISODateTimeFormatteddateAndTime {

	public static void main(String[] args) {

		
		DateTimeFormatter ISO_DATE_formatter = DateTimeFormatter.ISO_DATE;
		System.out.println("ISO_DATE: " + ISO_DATE_formatter.format(LocalDate.now()));
		
		
		DateTimeFormatter ISO_DATE_TIME_formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("ISO_DATE_TIME: " + ISO_DATE_TIME_formatter.format(LocalDateTime.now()));
	}

}
