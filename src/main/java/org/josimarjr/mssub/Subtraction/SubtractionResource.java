package org.josimarjr.mssub.Subtraction;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.json.JSONObject;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/subtraction/{value1}/{value2}")
public class SubtractionResource {

    @Inject
    SubtractionService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String subtraction(@PathParam double value1, @PathParam double value2) {
        JSONObject response = new JSONObject();
        double result = service.Subtracts(value1, value2);
        response.put("result", result);
        return response.toString();
    }
}
