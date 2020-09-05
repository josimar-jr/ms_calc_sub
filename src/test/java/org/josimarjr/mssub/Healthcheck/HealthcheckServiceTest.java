package org.josimarjr.mssub.Healthcheck;

import org.json.JSONObject;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit-test")
public class HealthcheckServiceTest {

    @Test
    public void testOk() {
        HealthcheckService service = new HealthcheckService();
        JSONObject response = new JSONObject(service.Ok());
        assertEquals("ok", response.get("status"));
    }
}
