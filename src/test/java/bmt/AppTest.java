package bmt;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{

    @Test
    public void test_fact_raises_exception_for_null_number() {
        Integer number = null;
        Integer power = 1;
        try {
            App.power(number,power);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot calculate power for null number", e.getMessage());
        }
    }

    @Test
    public void test_fact_raises_exception_for_null_power() {
        Integer number = 1;
        Integer power = null;
        try {
            App.power(number,power);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot calculate power for null number", e.getMessage());
        }
    }

    @Test
    public void power_0_and_numper_0_returns_0()
    {
        assertEquals(1.0, App.power(0, 0), 0.0001);
    }

    @Test
    public void power_0_and_any_namper_returns_1()
    {
        assertEquals(1.0, App.power(1, 0), 0.0001);
    }

    @Test
    public void power_1_and_numper_1_returns_1()
    {
        assertEquals(1.0, App.power(1, 1), 0.0001);
    }

    @Test
    public void power_2_and_numper_1_returns_1()
    {
        assertEquals(1.0, App.power(1, 2), 0.0001);
    }
    @Test
    public void power_1_and_numper_2_returns_1()
    {
        assertEquals(2.0, App.power(2,1 ), 0.0001);
    }
    public void power_2_and_numper_2_returns_1()
    {
        assertEquals(4.0, App.power(2,2 ), 0.0001);
    }

    
}