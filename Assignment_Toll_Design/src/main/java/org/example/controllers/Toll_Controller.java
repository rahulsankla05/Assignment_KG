package org.example.controllers;
import org.example.models.*;
import org.example.models.Toll_Pass;
import org.example.services.LeaderBoardService;
import org.example.services.TollService;
public class Toll_Controller {
    private TollService tollService;
    private LeaderBoardService leaderboardService;
    public Toll_Controller(TollService tollService,LeaderBoardService leaderboardService) { // Constructor//
        this.tollService = tollService;
        this.leaderboardService = leaderboardService;
    }
    // Now i'm creating method: To create pass, Scan Pass , Assign Booth to toll , Update Leaderboard //
    public Toll_Pass createToll_Pass(Vehicle vehicle,Pass_type pass_type, Toll toll, Toll_Booth toll_booth){
        return tollService.createToll_Pass(vehicle,pass_type,toll,toll_booth);
    }
    public void scanToll_Pass(Toll_Pass toll_pass, String vehicleId, Toll toll){
        tollService.scanToll_Pass(toll_pass,vehicleId,toll);
    }
    public void assignBooth(Toll toll, Toll_Booth toll_booth){
        tollService.assignBooth(toll, toll_booth);
    }
    public void updateLeaderboard(Toll_Booth toll_booth, Toll_Pass toll_pass){
        leaderboardService.updateLeaderboard(toll_booth,toll_pass);
    }
    public Leaderboard getToll_Booth_Leaderboard(Toll toll, Toll_Booth toll_booth){
        return leaderboardService.getToll_Booth_Leaderboard(toll,toll_booth);
    }
    public Leaderboard getToll_Leaderboard(Toll toll){
        return leaderboardService.getToll_Leaderboard(toll);
    }
    public void updateLeaderBoard(Toll_Booth tollBooth, Toll_Pass toll_pass)
    {  // new update//
        leaderboardService.updateLeaderboard(tollBooth, toll_pass);
    }
}