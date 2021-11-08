package com.company.controllers;

import java.sql.*;

public class TestDatabase {
    private String dbName;
    private String url;

    public TestDatabase(String dbName) {
        this.dbName = dbName;
        this.url = "jdbc:sqlite:C:/sqlite/db/" + dbName;
    }
    public void CheckDatabase(){
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                CreateTestDatabase();
                addTables();
                addData("Space Ishtar","5 Star");
                addData("Mysterious Heroine X Alter","5 Star");
                addData("Artoria Pendragon","5 Star");
                addData("Mash Kyrielight","4 star");
                addData("Atalante","4 star");
                addData("Marie Antonette","4 star");
                addData("Cu Chulainn(Caster)","3 star");
                addData("Antonio Saleri","3 star");
                addData("Gaius Julius Caestar","3 star");
                addData("Gareth","2 star");
                addData("Charles-Henri Sanson","2 star");
                addData("Leonidas I","2 star");
                addData("Charlotte Chorday","1 star");
                addData("JASON","1 star");
                addData("Arash","1 star");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void CreateTestDatabase(){
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void addTables(){
        String sql = "CREATE TABLE IF NOT EXISTS FullServantList (\n"
                + "	id integer PRIMARY KEY,\n"
                + " name text NOT NULL,\n"
                + " rarity text NOT NULL,\n"
                + ");";
        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void addData(String name,String rarity){
        String sql ="INSERT INTO FullServantList(name, rarity) VALUES ('"+ name + "', '" + rarity + "');";
        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
