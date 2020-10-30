package io.codeswarm.factory;

import java.math.BigDecimal;

public class EmployeeFactory {

    public static void main(String[] args) {

        Employee e0 = new Manager();
        e0.create("Nicola", "Tesla", new BigDecimal("6000.00"));
        e0.print();

        Employee e1 = new Programmer();
        e1.create("Albert", "Einstein", new BigDecimal("6500.00"));
        e1.print();

        Employee e2 = new Secretary();
        e2.create("James", "Bond", new BigDecimal("5000.00"));
        e2.print();
    }
}
