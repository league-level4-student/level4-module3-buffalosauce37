package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double x, double y) {
		if(y == 0.0) {
	throw new IllegalArgumentException();
		}
		return x/y;
		
	}
}
