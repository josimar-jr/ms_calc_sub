package org.josimarjr.mssub.Healthcheck;

import org.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HealthcheckService {
    public String Ok() {
        JSONObject response = new JSONObject();
        response.put("status", "ok");
        return response.toString();
    }
}
