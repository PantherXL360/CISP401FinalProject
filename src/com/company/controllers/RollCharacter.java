package com.company.controllers;

import com.company.models.Characters;

public class RollCharacter {
    //get roll amount form the models
    //use roll amount that is to set up the random
    //call the rarity to make it harder to get certain characters
    //send the result of the rolls
    public void RollAmount(int roll) {
        Characters character=new Characters();
        String []rollResults=new String[roll];
        for (int i = 0; i < roll; i++) {
            rollResults[i]=character.getCharacter();
        }

    }
}
