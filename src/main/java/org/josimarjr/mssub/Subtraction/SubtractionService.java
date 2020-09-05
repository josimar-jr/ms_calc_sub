package org.josimarjr.mssub.Subtraction;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SubtractionService {

    public int Subtracts(int value1, int value2) {
        return value1 - value2;
    }

    public double Subtracts(double value1, double value2) {
        return value1 - value2;
    }
}
