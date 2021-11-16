package io.codeswarm.adapter;

public class CandidateService {

    private CandidateRepository repository;

    public CandidateService(CandidateRepository repository) {
        this.repository = repository;
    }

    public void create(Candidate candidate) {
        repository.create(candidate);
    }

    public void delete(Candidate candidate) {
        repository.delete(candidate);
    }
}
