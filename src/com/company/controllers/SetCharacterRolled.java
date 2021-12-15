package com.company.controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class SetCharacterRolled{
    private String characterResult;
    public  SetCharacterRolled(){
        characterResult="Test";
    }
    public void RandomSet()
    {
        System.out.println("Entered Code:getCharacter");
        String rarity = "";
        Random randomRoll=new Random();
        int theRoll = randomRoll.nextInt(100) + 1;
        if (theRoll >=50){
            //1 star
            rarity = "1 star";
        }
        else if (theRoll >=25){
            //2nd star
            rarity = "2 star";
        }
        else if (theRoll >=15)
        {
           //3rd star
            rarity = "3 star";
        }
        else if (theRoll >=5)
        {
            //4th star
            rarity = "4 star";
        }
        else
        {
            //5th star
            rarity = "5 star";
        }
        GetCharacterFromList(rarity);
    }
    public void GetCharacterFromList(String rarity){
        String dbName="FullServantList.db";
        String url = "jdbc:sqlite:C:/sqlite/db/" + dbName;
        System.out.println("Entered Code:GetCharacterFromList");
        try (Connection conn = DriverManager.getConnection(url)){
            if (conn != null){
               TestDatabase testDB=new TestDatabase(dbName);
               testDB.CheckDatabase();
            }
            String sql="SELECT name, rarity FROM FullServantList WHERE rarity = '"+ rarity+ "'";
            if (conn != null){
                Statement statement = conn.createStatement();
                if (statement != null) {
                    ResultSet pool = statement.executeQuery(sql);
                    ArrayList<String> randomPool = new ArrayList<>();
                    if (pool != null){
                        while (pool.next()){
                            String name = pool.getString("name");
                            String rarityS = pool.getString("rarity");
                            String entry = name + " " + rarityS;
                            randomPool.add(entry);
                        }
                        String[] fullRandomArray;
                        fullRandomArray = randomPool.toArray(new String[randomPool.size()]);
                        int rand = new Random().nextInt(fullRandomArray.length);
                        setCharacterResult(fullRandomArray[rand]);
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Entered Code:GetCharacterFromList");
        }
    }

    public String getCharacterResult() {
        RandomSet();
        return characterResult;
    }

    public void setCharacterResult(String characterResult) {
        this.characterResult = characterResult;
    }
}
