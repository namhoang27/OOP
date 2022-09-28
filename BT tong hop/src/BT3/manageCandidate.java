package BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class manageCandidate {

    private List<Candidate> candidates;

    public manageCandidate() {
        this.candidates = new ArrayList<>();
    }

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public void showCandidateInfor() {
        this.candidates.forEach(candidate1 -> System.out.println(candidates.toString()));
    }

    public List<Candidate> searchCandidate(String id) {
        return this.candidates.stream().filter(n -> n.getId().contains(id)).collect(Collectors.toList());
    }
}
