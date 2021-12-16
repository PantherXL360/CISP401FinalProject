package com.company.models;

import com.company.controllers.SetCharacterRolled;

public class Characters {
    private String character;

    public Characters() {
        character="test";
    }

    public String getCharacter() {
        setCharacter();
        return character;
    }

    public void setCharacter() {
        SetCharacterRolled set = new SetCharacterRolled();
        character=set.getCharacterResult();
    }
}
