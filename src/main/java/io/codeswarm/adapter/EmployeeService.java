package io.codeswarm.adapter;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService() {
    }

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public void save(Employee employee) {
        repository.save(employee);
    }
}
