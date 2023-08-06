package org.example.models;
public class Vehicle {
    private String VRN;  // vehicle Regn number//
    private Vehicle_type vehicleType;
    private Toll_Pass toll_pass;
    public Vehicle(String VRN){
        this.VRN=VRN;
    }
    public String getVRN() {
        return VRN;
    }
    public Toll_Pass getToll_pass() {
        return toll_pass;
    }
    public void setToll_pass(Toll_Pass toll_pass) {
        this.toll_pass = toll_pass;
    }
}