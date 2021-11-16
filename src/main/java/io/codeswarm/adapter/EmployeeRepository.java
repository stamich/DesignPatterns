package io.codeswarm.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeRepository {

    private List<Employee> employees;

    public EmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> findAll() {
        return employees.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public void save(Employee employee) {
        employees.add(employee);
    }
}
