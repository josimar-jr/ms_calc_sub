package org.josimarjr.mssub;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HealthcheckService {
    public String Ok() {
        return "{'status': 'ok'}";
    }
}
