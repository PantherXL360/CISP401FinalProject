package com.company.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SetCharacterRolled{
    //set results for rolls to specific characters
    private int randomRoll;
    private int theRoll;
    private BufferedReader in;
    private String[] fullPool;
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
        try {
            Path characterPath = Path.of("src/files" + "Full_Servant_List.txt");
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

            in=new BufferedReader(new FileReader(String.valueOf(characterPath)));

            List<String> pool =new ArrayList<>();

            String character =null;

            try{
                character =in.readLine();
                while (character !=null){
                    pool.add(character);
                    character =in.readLine();
                }
                in.close();
                fullPool=pool.toArray(new String[pool.size()]);
                characterResult=getRandomCharacter(fullPool);
            }catch(IOException e){
                e.printStackTrace();
            }


        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public String getCharacterResult() {
        return characterResult;
    }

    public void setCharacterResult(String characterResult) {
        this.characterResult = characterResult;
    }
    private String getRandomCharacter(String[]fullPool) {
        int rand =new Random().nextInt(fullPool.length);
        return fullPool[rand];
    }
    //Note:due to waiting on Replies in the discussion not a lot of programming was done this will be fixied this week
    public void getDatabase(int rarity){

    }
}
