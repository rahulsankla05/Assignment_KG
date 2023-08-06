package org.example.models;
public class Toll_Booth {
    private String id;
    private Leaderboard leaderboard;

    @Override
    public String toString() {
        return "Toll_Booth{" +
                "id='" + id + '\'' +
                ", leaderboard=" + leaderboard +
                ", Active=" + Active +
                '}';
    }

    private boolean Active;

    public Leaderboard getLeaderboard() {
        return leaderboard;
    }
    public void setLeaderboard(Leaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    public Toll_Booth(String id){
        this.id=id;
        this.Active=false;
        this.leaderboard = new Leaderboard(0,0);
    }
    public void Activate_toll_booth(){this.Active=true;}
    public void DeActivate_toll_booth(){this.Active=false;}
    public void updateLeaderboard(Integer vehicle_count, Integer amount){
        this.leaderboard.setTotal_count(vehicle_count);
        this.leaderboard.setTotal_amount(amount);
    }
}