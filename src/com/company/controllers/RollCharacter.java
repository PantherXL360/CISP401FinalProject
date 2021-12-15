package com.company.controllers;

import com.company.models.Characters;
import com.company.view.DisplayResult;

public class RollCharacter {
    public void RollAmount(int roll) {
        System.out.println("Entered Code:RollAmount");
        Characters character=new Characters();
        String []rollResults=new String[roll];
        for (int i = 0; i < roll; i++) {
            System.out.println("Entered Code:for loop in Roll amount");
            rollResults[i]=character.getCharacter();
        }
        DisplayResult result=new DisplayResult();
        result.FullResult(rollResults,roll);
    }
}
