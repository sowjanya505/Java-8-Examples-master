package com.stream.examples;

import java.util.OptionalDouble;

public class UseOptionalDouble {

	public static void main(String[] args) {

		OptionalDouble optionalDouble = OptionalDouble.of(5.0);
		
		System.out.println("optionalDouble.isPresent(): " + optionalDouble.isPresent());
		
		
		System.out.println("optionalDouble.get(): " + optionalDouble.getAsDouble());
		
		
		System.out.println("optionalDouble.orElse: " + optionalDouble.orElse(6.0));
		
		System.out.println("\n1. optionalDouble.ifPresent");
		
		optionalDouble.ifPresent(System.out::println);
		
		System.out.println("\n2. optionalDouble.ifPresent");
		
		optionalDouble.ifPresent(d-> System.out.println("Value: " + d));
	}

}
