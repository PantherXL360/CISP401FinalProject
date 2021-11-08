package com.company.controllers;

import java.util.Random;

public class SetCharacterRolled{
    private int randomRoll;
    private int theRoll;
    private String characterResult;
    public void RandomSet(int roll)
    {
        int rarity=0;
        Random randomRoll=new Random();
        theRoll=randomRoll.nextInt(100)+1;
        if (theRoll >=50){
            //1 star
            rarity=1;
        }
        else if (theRoll >=25){
            //2nd star
            rarity=2;
        }
        else if (theRoll >=15)
        {
           //3rd star
            rarity=3;
        }
        else if (theRoll >5)
        {
            //4th star
            rarity=4;
        }
        else
        {
            //5th star
            rarity=5;
        }
    }
    public void GetCharacterFromList(int rarity){
        //Change to the database form
        switch(rarity){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:

        }
    }

    public String getCharacterResult() {
        return characterResult;
    }

    public void setCharacterResult(String characterResult) {
        this.characterResult = characterResult;
    }
    //Note:due to waiting on Replies in the discussion not a lot of programming was done this will be fixed this week
    public void getDatabase(int rarity){

    }
}
