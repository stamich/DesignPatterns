package io.codeswarm.factory;

import java.math.BigDecimal;

public interface Employee {

    void create(String firstName, String lastName);
    void setSalary(BigDecimal salary);
    void print();
}
