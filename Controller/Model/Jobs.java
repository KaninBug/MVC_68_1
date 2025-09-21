package Controller.Model;
public class Jobs {
    private String idJobs;
    private String nameJobs;
    private String detail;
    private String idComp;
    private String lastDate;
    private String status;

    public Jobs(String idJobs, String name, String detail, String idComp, String last, String status) {
        this.idJobs = idJobs;
        this.nameJobs = name;
        this.detail = detail;
        this.idComp = idComp;
        this.lastDate = last;
        this.status = status;
    }

    public Jobs() {}

    public String getIdJobs() {
        return idJobs;
    }

    public void setIdJobs(String idJobs) {
        this.idJobs = idJobs;
    }

    public String getNameJobs() {
        return nameJobs;
    }

    public void setNameJobs(String nameJobs) {
        this.nameJobs = nameJobs;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getIdComp() {
        return idComp;
    }

    public void setIdComp(String idComp) {
        this.idComp = idComp;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String last) {
        this.lastDate = last;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
