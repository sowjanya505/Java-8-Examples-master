package com.dates.examples;

import java.time.Clock;
import java.time.Instant;

public class ClockExample {

	public static void main(String[] args) {
		
		Clock clock = Clock.systemDefaultZone();
		System.out.println("Clock: " + clock);
		System.out.println("Current millisecond instant of the clock: " + clock.millis());
		
		
		Instant instant = clock.instant();
		System.out.println("Instant: " + instant);
	}

}
