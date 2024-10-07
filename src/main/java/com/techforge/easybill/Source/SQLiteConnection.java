package com.techforge.easybill.Source;

import java.sql.*;

public class SQLiteConnection {

    private static final String DB_URL = "jdbc:sqlite:easybill.db";

    public static Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL);
            System.out.println("Connection established succesfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public static void createusertable(){
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " username TEXT NOT NULL,\n"
                + " password TEXT NOT NULL,\n"
                + " email TEXT\n"
                + ");";
        try {
            Connection con = connect();
            Statement statement = con.createStatement();
            statement.execute(sql);
            System.out.println("User table created successfully");
            String sql1= "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(sql1);
            psmt.setString(1, "inbanithi");
            psmt.setString(2, "9865");
            psmt.setString(3, "inbanithi107@gmail.com");
            psmt.executeUpdate();
            System.out.println("inba added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
