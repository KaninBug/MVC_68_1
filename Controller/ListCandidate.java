package Controller;
import Controller.Model.Candidate;

import java.util.ArrayList;

public class ListCandidate {
    public ArrayList<Candidate> candidatesList = new ArrayList<>();
    public ArrayList<Candidate> adminsList = new ArrayList<>();

    public ListCandidate() {
        // Candidate
        candidatesList.add(new Candidate("30000001", "Alice", "Smith", "alice3456@email.com"));
        candidatesList.add(new Candidate("30000002", "John", "Ramsa", "lohn3106@email.com"));
        candidatesList.add(new Candidate("30000003", "Albert", "Wesker", "albrt0014@email.com"));
        candidatesList.add(new Candidate("30000004", "Joey", "Jamathy", "joei1111@email.com"));
        candidatesList.add(new Candidate("30000005", "Alex", "Wesker", "alex0015@email.com"));
        candidatesList.add(new Candidate("30000006", "Noland", "Hamton", "noland1475@email.com"));
        candidatesList.add(new Candidate("30000007", "Borban", " Alyka", "borban1234@email.com"));
        candidatesList.add(new Candidate("30000008", "Frauka", "Vetty", "frauka4876@email.com"));
        candidatesList.add(new Candidate("30000009", "Miky", "Kraufson", "miky8899@email.com"));
        candidatesList.add(new Candidate("30000010", "Sara", "Anthon", "sara7796@email.com"));

        // Admin
        adminsList.add(new Candidate("40000001", "Kavika", "Microlos", "kavika4452@email.com"));
    }

    public ArrayList<Candidate> getCandList() {
        return candidatesList;
    }
    public ArrayList<Candidate> getAdminList() {
        return adminsList;
    }
}