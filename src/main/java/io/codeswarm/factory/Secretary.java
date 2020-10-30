package io.codeswarm.factory;

import java.math.BigDecimal;

public class Secretary implements Employee {

    private final Person person = new Person();

    @Override
    public void create(String firstName, String lastName) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
    }

    @Override
    public void setSalary(BigDecimal salary) {
        person.setSalary(salary);
    }

    @Override
    public void print() {
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getSalary() + "\n");
    }
}
