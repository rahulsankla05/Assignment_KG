package org.example.models;
import java.util.ArrayList;
import java.util.List;
public class Toll {
    private final String Toll_name;
    private List<Toll_Booth> boothList;
    private  Leaderboard leaderboard;

    public List<Toll_Booth> getBoothList() {
        return boothList;
    }

    public void setBoothList(List<Toll_Booth> boothList) {
        this.boothList = boothList;
    }

    public String getToll_name() {
        return Toll_name;
    }
    public Leaderboard getLeaderboard() {
        return leaderboard;
    }

    // Constructor//
    public Toll(String Toll_name){
        this.Toll_name=Toll_name;
        this.boothList = new ArrayList<>();
        this.leaderboard=new Leaderboard(0.0,0.0);
    }
// Methods to add booths in toll, update Leaderboard of Toll , remove inactive toll booths //
    public void addToll_booth(Toll_Booth toll_booth){
        boothList.add(toll_booth);// adding toll_booth in booth list//
    }
    public void updateLeaderboard(double vehicle_count,double amount){
        this.leaderboard.setTotal_count(vehicle_count);
        this.leaderboard.setTotal_amount(amount);
    }
    public void removeToll_booth(Toll_Booth toll_booth){
        this.boothList.remove(toll_booth);    // Removing the toll_booth from List of toll_booths//
    }
}