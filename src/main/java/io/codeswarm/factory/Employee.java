package io.codeswarm.factory;

import java.math.BigDecimal;

public interface Employee {

    void create(String firstName, String lastName, BigDecimal salary);
    void print();
}
