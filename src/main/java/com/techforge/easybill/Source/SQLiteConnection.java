package com.techforge.easybill.Source;

import java.sql.*;
import java.util.concurrent.Callable;

public class SQLiteConnection {

    private static final String DB_URL = "jdbc:sqlite:easybill.db";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL);
            System.out.println("Connection established succesfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public static void createusertable() {
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
            String sql1 = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
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

    public static void createbilltable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS bill ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "customer_id INTEGER, "
                + "admin TEXT, "
                + "products TEXT, "           // Store as JSON
                + "rate INTEGER, "
                + "datetime TEXT"             // Store as ISO 8601 formatted string
                + ");";
        try {


            Connection con = connect();
            Statement stmt = con.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("bill created succesfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void createproducttable() {
        String productsql = "CREATE TABLE IF NOT EXISTS product ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100), "
                + "barcode VARCHAR(50), "
                + "mrp INT,"
                + "price INT"
                + ")";

        try {
            Connection con = connect();
            Statement statement = con.createStatement();
            statement.execute(productsql);
            System.out.println("product table created succesfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
