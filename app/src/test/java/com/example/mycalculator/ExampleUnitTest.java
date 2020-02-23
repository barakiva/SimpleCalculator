package com.example.mycalculator;

import com.example.mycalculator.services.ArithmeticService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleUnitTest {
    static ArithmeticService arService;
    @BeforeAll
    public static void setUp() {
        arService = new ArithmeticService();
    }
    @Test
    public void additionAccuracy() {
        for(int i = 0; i < 10; i++){
            double res = arService.add(i, 10);
            assertEquals(res, i + 10);
        }
    }
    @Test
    public void subtractionAccuracy() {
        for(int i = 0; i < 10; i++){
            double res = arService.subtract(i,10);
            assertEquals(res, i - 10);
        }
    }
    @Test
    public void multiplicationAccuracy() {
        for(int i = 0; i < 10; i++){
            double res = arService.multiply(i, 10);
            assertEquals(res, i * 10);
        }
    }
    @Test
    public void divisionAccuracy() {
        for(int i = 0; i < 10; i++){
            double res = (double) 5 / 10;
            assertEquals(res, arService.divide(5, 10));
        }
    }
}
