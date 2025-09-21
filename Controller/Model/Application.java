package Controller.Model;
public class Application {
    private String idApp;
    private String idUser;
    private String dateApp;

    public Application(String idApp, String idUser, String dateApp) {
        this.idApp = idApp;
        this.idUser = idUser;
        this.dateApp = dateApp;
    }

    public Application() {}

    public String getIdApp() {
        return idApp;
    }

    public void setIdApp(String idApp) {
        this.idApp = idApp;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getDateApp() {
        return dateApp;
    }

    public void setDateApp(String dateApp) {
        this.dateApp = dateApp;
    }
}
