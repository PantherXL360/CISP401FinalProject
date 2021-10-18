package com.company.view;

public class DisplayResult {

    public void FullResult(String []rolls,int rollTotal)
    {
        for (int i=0;i< rollTotal;i++)
        {
            System.out.println("You got " + rolls[i]);//add part for rarity later
        }
    }
}
