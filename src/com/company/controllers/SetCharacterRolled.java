package com.company.controllers;

import java.util.Random;

public class SetCharacterRolled{
    //set results for rolls to specific characters
    private int randomRoll;
    private int theRoll;
    public void RandomSet(int roll)
    {
        Random randomRoll=new Random();
        theRoll=randomRoll.nextInt(100)+1;
        if (theRoll >=50){
            //1 star
        }
        else if (theRoll >=25){
            //2nd star
        }
        else if (theRoll >=15)
        {
           //3rd star
        }
        else if (theRoll >5)
        {
            //4th star
        }
        else
        {
            //5th star
        }
    }
}
