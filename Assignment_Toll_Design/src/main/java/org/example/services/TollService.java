package org.example.services;
import org.example.exceptions.PassNotFoundException;
import org.example.models.*;
public class TollService {
    private boolean isValidPass(String vehicleId, Toll_Pass toll_pass,Toll toll){
        return (toll_pass.isPassValid(toll) && (toll_pass.getVehicle().getVRN().equals(vehicleId)));
    }
    public void scanToll_Pass(Toll_Pass toll_pass, String vehicleId, Toll toll) {
        if(!isValidPass(vehicleId, toll_pass ,toll)){ // abstract method in Toll_pass class//
            System.out.println("InValid Pass, Please Purchase new Pass, Thankyou!!");
        }
        toll_pass.updatePass();    // else update the pass//
    }
    public void assignBooth(Toll toll, Toll_Booth toll_booth){
        toll_booth.Activate_toll_booth();
        toll.addToll_booth(toll_booth);
    }
    public Toll_Pass createToll_Pass(Vehicle vehicle, Pass_type pass_type, Toll toll, Toll_Booth toll_booth) {
        if(pass_type.equals(Pass_type.Single_Pass)){
            return createSingleToll_Pass(vehicle,toll,toll_booth);
        }
        if(pass_type.equals(Pass_type.Return_Pass)){
            return createReturnToll_Pass(vehicle,toll,toll_booth);
        }
        if(pass_type.equals(Pass_type.Weekly_Pass)){
            return create_WeeklyToll_Pass(vehicle,toll,toll_booth);
        }
        throw new PassNotFoundException();
    }
    private Toll_Pass create_WeeklyToll_Pass(Vehicle vehicle, Toll toll, Toll_Booth toll_booth){
        Bill bill = new Bill(1000,vehicle,toll,toll_booth);   // here weekly pass amount considered  Rs. 1000/-
        Toll_Pass toll_pass = new Weekly_Pass(toll,toll_booth, vehicle, bill);
        return toll_pass;
    }
    private Toll_Pass createReturnToll_Pass(Vehicle vehicle, Toll toll, Toll_Booth toll_booth) {
        Bill bill = new Bill(150,vehicle,toll,toll_booth);  // here Return pass amount considered  Rs. 150/-
        Toll_Pass toll_pass = new Return_Pass(toll,toll_booth,bill,vehicle);
        return toll_pass;
    }
    private Toll_Pass createSingleToll_Pass(Vehicle vehicle, Toll toll, Toll_Booth toll_booth){
        Bill bill = new Bill(100,vehicle,toll,toll_booth);  // here Single_pass amount considered  Rs. 100/-
        Toll_Pass toll_pass = new Single_Pass("01",toll,toll_booth,vehicle,bill);
        return toll_pass;
    }
}