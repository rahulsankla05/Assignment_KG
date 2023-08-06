package org.example.models;

public abstract class Toll_Pass {
    private  Toll toll;
    private Toll_Booth toll_booth;
    private Vehicle vehicle;
    private Bill bill;
    protected Pass_type pass_type;
    protected Pass_Status pass_status;

    public Toll_Pass(Toll toll, Toll_Booth toll_booth,Vehicle vehicle,Bill bill){
        this.toll=toll;
        this.toll_booth = toll_booth;
        this.vehicle = vehicle;
        this.bill = bill;
    }
    public Toll getToll(){
        return toll;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public void setPass_status(Pass_Status pass_status){
        this.pass_status=pass_status;
    }
    public abstract boolean isPassValid(Toll toll);
    public abstract void updatePass();

    public Toll_Booth getToll_booth() {
        return toll_booth;
    }
    public Bill getBill() {
        return bill;
    }
    public Pass_type getPass_type() {
        return this.pass_type;
    }
}