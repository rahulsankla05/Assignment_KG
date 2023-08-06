package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Toll_Firm {
    private String FirmName;
    private String Id;
    private List<Toll> Toll_list;

    public Toll_Firm(String FirmName, String Id){
        this.FirmName=FirmName;
        this.Id=Id;
        this.Toll_list = new ArrayList<>();
    }
    public void addToll(Toll newToll){
        Toll_list.add(newToll);
    }
}