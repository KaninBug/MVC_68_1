package Controller.Model;
public class Candidate {
    private String idCand;
    private String fnameCand;
    private String lnameCand;
    private String emailCand;

    public Candidate(String id, String fname, String lname, String email) {
        this.idCand = id;
        this.fnameCand = fname;
        this.lnameCand = lname;
        this.emailCand= email;
    }

    public Candidate() {}

    public String getIdCand() {
        return idCand;
    }

    public void setIdCand(String id) {
        idCand = id;
    }

    public String getFnameCand() {
        return fnameCand;
    }

    public void setFnameCand(String fname) {
        fnameCand = fname;
    }

    public String getLnameCand() {
        return lnameCand;
    }

    public void setLnameCand(String lname) {
        lnameCand = lname;
    }

    public String getEmailCand() {
        return emailCand;
    }

    public void setEmailCand(String email) {
        emailCand = email;
    }
}
