package com.company.models;

import com.company.controllers.SetCharacterRolled;

public class Characters {
    private String character;

    public Characters() {
        character="test";
    }

    public String getCharacter() {
        System.out.println("Entered Code:getCharacter");
        setCharacter();
        return character;
    }

    public void setCharacter() {
        System.out.println("Entered Code:SetCharacter");
        SetCharacterRolled set = new SetCharacterRolled();
        character=set.getCharacterResult();
    }
}
