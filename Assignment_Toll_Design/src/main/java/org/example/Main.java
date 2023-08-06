package org.example;
import org.example.controllers.Toll_Controller;
import org.example.models.*;
import org.example.services.*;
public class Main {
    public static void main(String[] args) {
        TollService tollService = new TollService();
        LeaderBoardService leaderBoardService = new LeaderBoardService();
        Toll_Controller toll_controller = new Toll_Controller(tollService,leaderBoardService);

        Toll toll_PC = new Toll("110016");   // Toll_1 //
        Toll toll_KG = new Toll("110005");   // Toll_2 //


        Toll_Booth toll_booth1 = new Toll_Booth("1");
        Toll_Booth toll_booth2 = new Toll_Booth("2");
//        System.out.println();
        toll_controller.assignBooth(toll_PC,toll_booth2);
        toll_controller.assignBooth(toll_KG,toll_booth1);
        System.out.println(toll_PC.getBoothList());
        Vehicle tw_Bike = new Two_wheeler("DL1S0001");
        Vehicle car = new Four_wheeler("DL5S0002");
        Vehicle pvt_car = new Four_wheeler("DL1");
        Vehicle RS_car = new Four_wheeler("CH0001");

        Toll_Pass pass_1 = toll_controller.createToll_Pass(tw_Bike,Pass_type.Weekly_Pass,toll_PC,toll_booth2);
        Toll_Pass pass_2 = toll_controller.createToll_Pass(car,Pass_type.Weekly_Pass,toll_KG,toll_booth1);
        Toll_Pass pass_3 = toll_controller.createToll_Pass(pvt_car,Pass_type.Return_Pass,toll_KG,toll_booth1);
        Toll_Pass pass_VIP = toll_controller.createToll_Pass(RS_car,Pass_type.Single_Pass,toll_PC,toll_booth1);
//        updated//
        toll_controller.updateLeaderboard(pass_1.getToll_booth(), pass_1);
        toll_controller.updateLeaderboard(pass_2.getToll_booth(), pass_2);
        toll_controller.updateLeaderboard(pass_3.getToll_booth(), pass_3);
        toll_controller.updateLeaderboard(pass_VIP.getToll_booth(), pass_VIP);

//  LeaderBoard Stats //
        System.out.println("Toll_PC " + toll_controller.getToll_Leaderboard(toll_PC).getTotal_amount());
        System.out.println("Toll_KG " + toll_controller.getToll_Leaderboard(toll_KG).getTotal_amount());

        toll_controller.scanToll_Pass(pass_VIP,"1",toll_PC);
        System.out.println("Booth_Leaderboard " + toll_controller.getToll_Booth_Leaderboard(toll_KG,toll_booth1));
    }
}