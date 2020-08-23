package org.josimarjr.mssub.Healthcheck;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HealthcheckService {
    public String Ok() {
        return "{'status': 'ok'}";
    }
}
