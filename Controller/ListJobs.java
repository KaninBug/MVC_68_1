package Controller;
import Controller.Model.Jobs;
import java.util.ArrayList;

public class ListJobs {
    public ArrayList<Jobs> jobsList = new ArrayList<>();

    public ListJobs() {
        jobsList.add(new Jobs("20000001", "Human Resource", "Management people in company", "10000001", "01-01-2026", "Open"));
        jobsList.add(new Jobs("20000002", "Bio Scientist", "Reserch about plants and living biology", "10000001", "01-12-2025", "Open"));
        jobsList.add(new Jobs("20000003", "Virus Scientist", "Research about new virus and model", "10000001", "01-01-2026", "Open"));
        jobsList.add(new Jobs("20000004", "Security Guard", "Protect anything that can happened", "10000001", "10-10-2025", "Open"));
        jobsList.add(new Jobs("20000005", "Software Engineer", "Maintainance system in company", "10000001", "12-11-2025", "Close"));
        jobsList.add(new Jobs("20000006", "Leader Ship", "Management people in spaceship", "10000002", "09-09-2025", "Open"));
        jobsList.add(new Jobs("20000007", "Crew Ship", "Crew of wayland spaceship", "10000002", "10-12-2025", "Open"));
        jobsList.add(new Jobs("20000008", "Engineer", "Repair spceship", "10000002", "16-01-2026", "Open"));
        jobsList.add(new Jobs("20000009", "Scientist", "Research any new things", "10000002", "10-10-2025", "Close"));
        jobsList.add(new Jobs("20000010", "Security Guard", "Protect leader, crew and any person", "10000002", "12-11-2025", "Close"));
    }
    public ArrayList<Jobs> getJobsList() { 
        return jobsList;
    }
}
