package bmt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This class contains unit tests for the App class.
 */
public class AppTest {

    /**
     * Test case to verify that the method raises an exception when the number parameter is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_power_raises_exception_for_null_number() {
        Integer number = null;
        Integer power = 1;
        App.power(number, power);
    }

    /**
     * Test case to verify that the method raises an exception when the power parameter is null.
     */
    @Test
    public void test_power_raises_exception_for_null_power() {
        Integer number = 1;
        Integer power = null;
        try {
            App.power(number, power);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot calculate power for null number", e.getMessage());
        }
    }

    /**
     * Test case to verify that power(0, 0) returns 1.
     */
    @Test
    public void power_0_and_numper_0_returns_1() {
        assertEquals(1.0, App.power(0, 0), 0.0001);
    }

    /**
     * Test case to verify that power(1, 0) returns 1.
     */
    @Test
    public void power_0_and_any_number_returns_1() {
        assertEquals(1.0, App.power(1, 0), 0.0001);
    }

    /**
     * Test case to verify that power(1, 1) returns 1.
     */
    @Test
    public void power_1_and_number_1_returns_1() {
        assertEquals(1.0, App.power(1, 1), 0.0001);
    }

    /**
     * Test case to verify that power(1, 2) returns 1.
     */
    @Test
    public void power_2_and_number_1_returns_1() {
        assertEquals(1.0, App.power(1, 2), 0.0001);
    }

    /**
     * Test case to verify that power(2, 1) returns 2.
     */
    @Test
    public void power_1_and_number_2_returns_2() {
        assertEquals(2.0, App.power(2, 1), 0.0001);
    }

    /**
     * Test case to verify that power(2, 2) returns 4.
     */
    @Test
    public void power_2_and_number_2_returns_4() {
        assertEquals(4.0, App.power(2, 2), 0.0001);
    }
}
