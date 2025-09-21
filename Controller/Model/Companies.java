package Controller.Model;
public class Companies {
    private String idComp;
    private String nameComp;
    private String emailComp;
    private String locationComp;

    public Companies(String id, String name, String email, String location) {
        this.idComp = id;
        this.nameComp = name;
        this.emailComp = email;
        this.locationComp = location;
    }

    public Companies() {}

    public String getIdComp() {
        return idComp;
    }

    public void setIdComp(String id) {
        idComp = id;
    }

    public String getNameComp() {
        return nameComp;
    }

    public void setNameComp(String name) {
        nameComp = name;
    }

    public String getEmailComp() {
        return emailComp;
    }

    public void setEmailComp(String email) {
        emailComp = email;
    }

    public String getLocationComp() {
        return locationComp;
    }

    public void setLocationComp(String location) {
        locationComp = location;
    }
}
