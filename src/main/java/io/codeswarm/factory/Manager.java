package io.codeswarm.factory;

import java.math.BigDecimal;

public class Manager implements Employee {

    private final Person person = new Person();

    @Override
    public void create(String firstName, String lastName, BigDecimal salary) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setSalary(salary);
    }

    @Override
    public void print() {
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getSalary() + "\n");
    }
}
