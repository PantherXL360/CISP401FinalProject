package com.company.controllers;

import com.company.models.Characters;
import com.company.view.DisplayResult;

public class RollCharacter {
    public void RollAmount(int roll) {
        Characters character=new Characters();
        String []rollResults=new String[roll];
        for (int i = 0; i < roll; i++) {
            rollResults[i]=character.getCharacter();
        }
        DisplayResult result=new DisplayResult();
        result.FullResult(rollResults,roll);
    }
}
