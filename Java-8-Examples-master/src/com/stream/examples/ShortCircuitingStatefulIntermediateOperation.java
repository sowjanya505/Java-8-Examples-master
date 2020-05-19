package com.stream.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ShortCircuitingStatefulIntermediateOperation {

	public static void main(String[] args) {

		
		OptionalInt optionalInt = IntStream.of(1, 2, 3, 4, 5).findFirst();
		System.out.println("optionalInt.getAsInt(): " + optionalInt.getAsInt());
		
		
		OptionalInt optionalInt1 = IntStream.of(1, 2, 3, 4, 5).findAny();
		System.out.println("optionalInt1.getAsInt(): " + optionalInt1.getAsInt());
		
		
		boolean anyRecordGreaterThan2 = IntStream.of(1, 2, 3, 4, 5).anyMatch(n-> n > 2);
		System.out.println("Any record greater than 2: " + anyRecordGreaterThan2);
		
		
		boolean allRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).allMatch(n-> n > 2);
		System.out.println("All record greater than 2: " + allRecordGreaterThan);
		
		
		boolean noneRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).noneMatch(n-> n > 6);
		System.out.println("None record greater than 6: " + noneRecordGreaterThan);
	}

}
