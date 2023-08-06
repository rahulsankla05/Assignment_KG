package org.example.models;
public class Return_Pass extends Toll_Pass{
    private Integer Trip_count;
    public Return_Pass(Toll toll,Toll_Booth toll_booth,Bill bill, Vehicle vehicle){
        super(toll,toll_booth,vehicle,bill);
        this.pass_status=pass_status.Valid;
        this.Trip_count=1;
        this.pass_type=pass_type.Return_Pass;
    }
    @Override
    public boolean isPassValid(Toll toll) {
        return (this.getToll().equals(toll)) && this.pass_status == pass_status.Valid;
    }
    @Override
    public void updatePass() {
        this.Trip_count++;
        this.setPass_status(pass_status.Expired);
    }
}