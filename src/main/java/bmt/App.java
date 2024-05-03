package bmt;

/**
 * This class provides methods for simple mathematical operations.
 */
public class App {

    /**
     * This method calculates the power of a specific number with a given exponent.
     * @param number The number to be raised to a power.
     * @param exponent The exponent that determines the power.
     * @return The result of the calculation.
     * @throws IllegalArgumentException If any of the parameters is null.
     */
    public static double power(Integer number, Integer exponent) {
        double result = 1.0;
        if (number == null || exponent == null){
            // Throw exception if either number or exponent is null
            null_number();
        } else {
            if (exponent < 0) {
                // Handling negative exponent case
                for (int i = 0; i < -exponent; i++) {
                    result /= number; 
                }
            } else if (exponent > 0) {
                // Handling positive exponent case
                for (int i = 0; i < exponent; i++) {
                    result *= number; 
                }
            } else {
                // Handling exponent equals zero case
                return result;
            }
        }
        return result;
    }

    /**
     * This method throws an IllegalArgumentException indicating that the number parameter is null.
     * @throws IllegalArgumentException Indicates null number parameter.
     */
    public static void null_number() {
        throw new IllegalArgumentException("Cannot calculate power for null number");
    }
}
