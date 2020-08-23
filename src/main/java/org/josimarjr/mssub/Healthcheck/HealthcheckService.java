package org.josimarjr.mssub.Healthcheck;

//import com.googlecode.json-simple.*;
import org.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HealthcheckService {
    public String Ok() {
//        String status = "{\"status\": \"ok\"}";
//        return status;
        JSONObject response = new JSONObject();
        response.put("status", "ok");
        return response.toString();
    }
}
