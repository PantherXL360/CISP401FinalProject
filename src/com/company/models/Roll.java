package com.company.models;

public class Roll {
    private int rollAmount;

    public Roll() {
        rollAmount=0;
    }

    public int getRollAmount() {
        System.out.println(rollAmount);
        return rollAmount;
    }

    public void setRollAmount(int rollAmount) {
        this.rollAmount = rollAmount;
        System.out.println(rollAmount);
    }
}
