package com.company.controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class SetCharacterRolled{
    private int randomRoll;
    private String characterResult;
    public void RandomSet(int roll)
    {
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
        String dbName="Full_Servant_List";
        String url = "jdbc:sqlite:C:/sqlite/db/" + dbName;
        try (Connection conn = DriverManager.getConnection(url)){
            if (conn != null){
               TestDatabase testDB=new TestDatabase(dbName);
               testDB.CreateTestDatabase();
            }
            String sql="SELECT name, rarity FROM FullServantList WHERE rarity =(rarity) ";
            Statement statement = conn.createStatement();
            ResultSet pool=statement.executeQuery(sql);
            ArrayList<String>randomPool=new ArrayList<>();
            while (pool.next()){
                String name=pool.getString("name");
                String rarityS=pool.getString("rarity");
                String entry=name + " " + rarityS;
                randomPool.add(entry);
            }
            String []fullRandomArray=randomPool.toArray(new String[randomPool.size()]);
            int rand = new Random().nextInt(fullRandomArray.length);
            setCharacterResult(fullRandomArray[rand]);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public String getCharacterResult() {
        return characterResult;
    }

    public void setCharacterResult(String characterResult) {
        this.characterResult = characterResult;
    }
}
