package org.example.services;

import org.example.models.*;
//import org.example.models.Toll_Booth;
//import org.example.models.Toll_Pass;

import java.util.ArrayList;
import java.util.List;
public class LeaderBoardService {
    public void updateLeaderboard(Toll_Booth tollBooth, Toll_Pass toll_pass) {  // updated //
        double count = tollBooth.getLeaderboard().getTotal_count() + 1;
        tollBooth.getLeaderboard().setTotal_count(count);

        double amount = tollBooth.getLeaderboard().getTotal_amount() + toll_pass.getBill().getAmount();
        tollBooth.getLeaderboard().setTotal_amount(amount);
//        new update //
        toll_pass.getToll().getLeaderboard().setTotal_count(toll_pass.getToll().getLeaderboard().getTotal_count()+1);
        toll_pass.getToll().getLeaderboard().setTotal_amount(toll_pass.getToll().getLeaderboard().getTotal_amount()+amount);
    }
    public Leaderboard getToll_Booth_Leaderboard(Toll toll, Toll_Booth toll_booth) {
        List<Toll_Booth> toll_boothList = toll.getBoothList();
        for(Toll_Booth t:toll_boothList){
            if(t.equals(toll_booth)){
                return t.getLeaderboard();
            }
        }
//        List<Toll_Pass> Pass_list = new ArrayList<>();
//        return getToll_Booth_Leaderboard(toll,toll_booth);
        return null;
    }
    /*
    Here i'm facing error //
     */
    public Leaderboard getToll_Leaderboard(Toll toll) {
        return toll.getLeaderboard();
//        if(getToll_Leaderboard(toll)==null){
//            return null;
//        }
//        return getToll_Leaderboard(toll);
    }
    private double getTotalAmount(List<Toll_Pass> Pass_list){
        double totalAmount = 0.0;
        for(Toll_Pass pass:Pass_list){
            totalAmount+=pass.getBill().getAmount();
        }
        return totalAmount;
    }
}