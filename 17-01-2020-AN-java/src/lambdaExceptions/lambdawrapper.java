package lambdaExceptions;

import java.util.*;

public class lambdawrapper {
	
	public static void main(String[] ar) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(i -> {
		    try {
		        System.out.println(50 / i);
		    } catch (ArithmeticException e) {
		        System.err.println(
		          "Arithmetic Exception occured : " + e.getMessage());
		    }
		});

	}
}
