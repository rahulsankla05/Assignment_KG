package org.example.models;
public class Leaderboard {
    private double total_count;  // number of vehicle passed//
    private double total_amount;  // collection

    @Override
    public String toString() {
        return "Leaderboard{" +
                "total_count=" + total_count +
                ", total_amount=" + total_amount +
                '}';
    }

    public Leaderboard(double total_count, double total_amount){  // Constructor//
        this.total_count = total_count;
        this.total_amount = total_amount;
    }
    public double getTotal_count() {
        return total_count;
    }
    public void setTotal_count(double vehicle_count) {
        this.total_count += vehicle_count;
    }
    public double getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(double amount) {
        this.total_amount += amount;
    }
}