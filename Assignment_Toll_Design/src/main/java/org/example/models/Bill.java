package org.example.models;

public class Bill {
    private Integer amount;
    private Vehicle vehicle;
    private Toll toll;
    private Toll_Booth toll_booth;
    public Bill(Integer amount, Vehicle vehicle, Toll toll,Toll_Booth toll_booth){
        this.amount=amount;
        this.vehicle =vehicle;
        this.toll = toll;
        this.toll_booth = toll_booth;
    }

    public Integer getAmount() {
        return amount;
    }
}