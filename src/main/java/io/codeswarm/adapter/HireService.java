package io.codeswarm.adapter;

public class HireService {

    private final CandidateService candidateService;
    private final EmployeeService employeeService;

    public HireService(CandidateService candidateService, EmployeeService employeeService) {
        this.candidateService = candidateService;
        this.employeeService = employeeService;
    }

    public void hire(Candidate candidate) {

        // interview result
        if (candidate.getSuccessful() && candidate.getSelected()) {
            candidateService.delete(candidate);
            employeeService.save(EmployeeAdapter.getEmployee(candidate));
        } else {
            System.out.println("Operation not possible.");
        }
    }
}
