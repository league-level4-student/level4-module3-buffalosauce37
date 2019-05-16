package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double x, double y) {
		if (y == 0.0) {
			throw new IllegalArgumentException();
		}
		return x / y;
	}

	String reverseString(String str) {
		String x = "";
		if (str.equals("")) {
			throw new IllegalStateException();
		}
		for (int i = 0; i < str.length(); i++) {
			x += str.charAt(str.length() - 1 - i);
		}
		return x;

	}
}
