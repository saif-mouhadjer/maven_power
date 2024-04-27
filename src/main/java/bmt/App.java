package bmt;


public class App {
    public static double power(Integer number , Integer exponent) {
        double result = 1.0;
        if (number == null || exponent == null){
            null_namber();
        }else{
            if (exponent < 0) {
                for (int i = 0; i < -exponent; i++) {
                    result /= number; 
                }
            } else if (exponent > 0) {
                for (int i = 0; i < exponent; i++) {
                    result *= number; 
                }
            } else {
                return result;
            }
        }
        
        return result;
    }
    public static void null_namber() {
        throw new IllegalArgumentException("Cannot calculate power for null number");
    }
}
