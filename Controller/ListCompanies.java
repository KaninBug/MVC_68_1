package Controller;
import Controller.Model.Companies;

import java.util.ArrayList;

public class ListCompanies {
    public ArrayList<Companies> compList = new ArrayList<>();
    
    public ListCompanies() {
        compList.add(new Companies("10000001", "Umbrella Corporation", "umbrella@email.com", "Raccoon City"));
        compList.add(new Companies("10000002", "Wayland-Yutani Corporation", "wayland@emial.com", "Washington D.C."));
    }

    public ArrayList<Companies> getCompList() {
        return compList;
    }
}
