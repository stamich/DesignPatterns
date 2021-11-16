package io.codeswarm.adapter;

public class EmployeeAdapter {

    public static Employee getEmployee(Candidate c) {
        return new Employee(c.getId(), c.getFirstName(), c.getLastName(), c.getCreatedAt());
    }
}
