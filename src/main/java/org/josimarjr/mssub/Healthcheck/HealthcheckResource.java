package org.josimarjr.mssub.Healthcheck;

import org.json.JSONObject;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/healthcheck")
public class HealthcheckResource {

    @Inject
    HealthcheckService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String healthcheck() {
        JSONObject response = new JSONObject();
        response.put("status", service.Ok());
        return response.toString();
    }
}
