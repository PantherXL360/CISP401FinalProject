package com.company.controllers;


import com.company.view.SetRoll;
import com.company.view.StartingMessage;

public class Main {

    public static void main(String[] args) {
        StartingMessage startGame=new StartingMessage();
        SetRoll startRoll=new SetRoll();
        RollCharacter gacha=new RollCharacter();
        startGame.Message();
        int userRoll=startRoll.UserRoll();
        gacha.RollAmount(userRoll);

    }
}
