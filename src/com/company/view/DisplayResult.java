package com.company.view;

public class DisplayResult {

    public void FullResult(String []rolls,int rollTotal)
    {
        System.out.println("Entered Code:FullResult");
        for (int i=0;i< rollTotal;i++)
        {
            System.out.println("Entered Code:For loop FullResult");
            System.out.println("You got " + rolls[i]);
        }
    }
}
