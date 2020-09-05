package org.josimarjr.mssub.Healthcheck;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit-test")
public class HealthcheckServiceTest {

    @Test
    public void testOk() {
        HealthcheckService service = new HealthcheckService();
        String status = service.Ok();
        assertEquals("ok", status);
    }
}
