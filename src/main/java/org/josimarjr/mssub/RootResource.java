package org.josimarjr.mssub;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/")
public class RootResource {

    @Inject
    HealthcheckService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String root() {
        return service.Ok();
    }
}