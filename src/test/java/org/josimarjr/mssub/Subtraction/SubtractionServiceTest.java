package org.josimarjr.mssub.Subtraction;

import org.josimarjr.mssub.Healthcheck.HealthcheckService;
import org.json.JSONObject;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit-test")
public class SubtractionServiceTest {

    @Test
    public void subtractTwoIntegers() {
        SubtractionService subtraction = new SubtractionService();
        int x = 13;
        int y = 1;

        int result = subtraction.Subtracts(x, y);
        assertEquals(12, result);
    }

    @Test
    public void subtractTwoDecimals() {
        SubtractionService subtraction = new SubtractionService();
        double x = 13.01;
        double y = 1.13;

        double result = subtraction.Subtracts(x, y);
        assertEquals(11.88, result, 0.001);
    }

    @Test
    public void subtractTwoIntegersWithNegativeResult() {
        SubtractionService subtraction = new SubtractionService();
        int x = 3;
        int y = 13;

        int result = subtraction.Subtracts(x, y);
        assertEquals(-10, result);
    }

    @Test
    public void subtractTwoDecimalsWithNegativeResult() {
        SubtractionService subtraction = new SubtractionService();
        double x = 7.01;
        double y = 10.13;

        double result = subtraction.Subtracts(x, y);
        assertEquals(-3.12, result, 0.001);
    }

    @Test
    public void subtractTwoNegativeIntegers() {
        SubtractionService subtraction = new SubtractionService();
        int x = -3;
        int y = 13;

        int result = subtraction.Subtracts(x, y);
        assertEquals(-16, result);
    }

    @Test
    public void subtractTwoNegativeDecimals() {
        SubtractionService subtraction = new SubtractionService();
        double x = -7.01;
        double y = 10.13;

        double result = subtraction.Subtracts(x, y);
        assertEquals(-17.14, result, 0.001);
    }
}
