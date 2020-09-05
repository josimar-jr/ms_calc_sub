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
}
