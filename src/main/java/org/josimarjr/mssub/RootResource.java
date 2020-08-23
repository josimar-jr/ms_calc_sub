package org.josimarjr.mssub;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.josimarjr.mssub.Healthcheck.HealthcheckService;

@Path("/")
public class RootResource {

    @Inject
    HealthcheckService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String root() {
        return service.Ok();
    }
}
