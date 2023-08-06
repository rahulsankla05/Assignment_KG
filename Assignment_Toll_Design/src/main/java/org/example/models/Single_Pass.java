package org.example.models;
import java.util.UUID;
public class Single_Pass extends Toll_Pass{
    private String id;
    public Single_Pass(String id, Toll toll, Toll_Booth toll_booth,Vehicle vehicle, Bill bill){
        super(toll,toll_booth,vehicle,bill);
        this.id = UUID.randomUUID().toString();
        this.pass_status=pass_status.Valid;
        this.pass_type = pass_type.Single_Pass;
    }
    @Override
    public boolean isPassValid(Toll toll) {
        return (this.pass_status == pass_status.Valid && this.getToll().equals(toll));
    }
    @Override
    public void updatePass(){
        this.setPass_status(pass_status.Expired);
    }
}