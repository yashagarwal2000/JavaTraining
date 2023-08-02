package com.lumen.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional<String> courseOptional = Arrays.asList("java", "angulat", "Node").stream()
				.filter(str -> str.length() > 10).findFirst();
		if (courseOptional.isPresent())
			System.out.println(courseOptional.get());

		courseOptional.ifPresent(System.out::println);
		String cname = Arrays.asList("java", "angulat", "Node").stream().filter(str -> str.length() > 1).findFirst()
				.orElse("No course");
		System.out.println(cname);

		String ccname = Arrays.asList("java", "angulat", "Node").stream().filter(str -> str.length() > 1).findFirst()
//					.get // if no value throws exception
				.orElseGet(() -> "hello"); // if value present retrn it or return the value in orElse
		System.out.println(ccname);

		String coname = Arrays.asList("java", "angulat", "Node").stream().filter(str -> str.length() > 1).findFirst()
//					.get // if no value throws exception
				.orElseThrow(() -> new RuntimeException("no value present")); // if value present retrn it or return the
																				// value in orElse
		System.out.println(ccname);

	}
}
