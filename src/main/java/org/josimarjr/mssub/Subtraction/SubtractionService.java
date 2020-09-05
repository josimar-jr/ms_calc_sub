package org.josimarjr.mssub.Subtraction;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubtractionService {

    int Subtracts(int value1, int value2) {
        return value1-value2;
    }
}
