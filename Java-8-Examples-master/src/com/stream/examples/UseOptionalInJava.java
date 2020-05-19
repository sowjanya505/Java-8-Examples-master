package com.stream.examples;

import java.util.Optional;

public class UseOptionalInJava {

	public static void main(String[] args) {

		Optional<String> optional = Optional.of("hello");
		
		
		System.out.println("optional.isPresent(): " + optional.isPresent());
		
		
		System.out.println("optional.get(): " + optional.get());
		
		
		System.out.println("optional.orElse: " + optional.orElse("alternateValue"));
		
		
		System.out.println("\n1. optional.ifPresent");
		
		optional.ifPresent(System.out::println);
		
		System.out.println("\n2 - optional.ifPresent");
       
        optional.ifPresent((i) -> System.out.println("value = " + i)); 
	}

}
