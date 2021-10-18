package com.company.view;

import com.company.models.Roll;

import java.util.Scanner;

public class SetRoll {

    private int userRoll;
    private Roll call;

    public void UserRoll() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of Rolls: Only 1 or 10 rolls is allowed");
        userRoll = input.nextInt();
        while (userRoll != 1 && userRoll != 10) {
            System.out.println("You did not enter a correct amount: 1 or 10 ONLY");
            userRoll = input.nextInt();
        }
        call.setRollAmount(userRoll);
    }
}
