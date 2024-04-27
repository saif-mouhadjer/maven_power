package bmt;


public class App {
    public static double power(Integer number , Integer exponent) {
        double result = 1.0;
        if (number == null || exponent == null){
            throw new IllegalArgumentException("Cannot calculate power for null number");
        }
        if (exponent == 0) {
            return result;
        } else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= number; 
            }
        } else {
            for (int i = 0; i < -exponent; i++) {
                result /= number; 
            }
        }
        return result;
    }
}
