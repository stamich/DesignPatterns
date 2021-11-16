package io.codeswarm.adapter;

import java.util.List;

public class CandidateRepository {

    private List<Candidate> candidates;

    public CandidateRepository(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public void create(Candidate candidate) {
        candidates.add(candidate);
    }

    public void delete(Candidate candidate) {
        candidates.remove(candidate);
    }
}
