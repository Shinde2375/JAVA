package com.tka.day23.prog1;
//import java.lang.StackWalker.Option;
import java.util.Optional;
public class Y {
	public static void main(String[] args) {
		String a1 = null;
//		String a1 = new String("Hello");
		if(a1 != null)
		System.out.println(a1.toUpperCase());
		
		Optional<String> s = Optional.ofNullable(new String("Hello"));
		
		if(s.isPresent())
			System.out.println(a1.toString().toUpperCase());
	}
}