package org.example.models;
import java.time.LocalDateTime;
import java.util.Date;
public class Weekly_Pass extends Toll_Pass{
    private Date Pass_Validity;
    public Weekly_Pass(Toll toll, Toll_Booth toll_booth,Vehicle vehicle,Bill bill){
        super(toll,toll_booth,vehicle,bill);
        this.Pass_Validity = new Date();
        this.pass_status = pass_status.Valid;
        this.pass_type = pass_type.Weekly_Pass;
    }
    @Override
    public boolean isPassValid(Toll toll) {
        return (this.pass_status == pass_status.Valid && this.getToll().equals(toll));
    }
    @Override
    public void updatePass() {
        Date currentdate = new Date();
        if(this.Pass_Validity.before(currentdate)){
            this.setPass_status(pass_status.Expired);
        }
    }
    private Date setPass_Validity() {
        Date newDate = new Date();
        LocalDateTime.from(newDate.toInstant()).plusDays(7);
        return newDate;
    }
}