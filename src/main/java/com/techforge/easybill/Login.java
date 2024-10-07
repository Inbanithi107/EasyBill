package com.techforge.easybill;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.techforge.easybill.Entity.GlobalUser;
import com.techforge.easybill.Entity.User;
import com.techforge.easybill.Source.SQLiteConnection;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    @FXML
    public JFXButton signin;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXTextField password;

    @FXML
    private ImageView imageview;

    public void initialize(){
        Image image = new Image(getClass().getResourceAsStream("/LoginImage.jpg"));
        imageview.setImage(image);
    }

    public void login(){
        String usernamestring = username.getText();
        String  passwordstring = password.getText();
        System.out.println();
        String sql = "SELECT * FROM users WHERE username = ?";
        try {
            Connection connection = SQLiteConnection.connect();
            PreparedStatement psmt = connection.prepareStatement(sql);
            psmt.setString(1, usernamestring);
            ResultSet set = psmt.executeQuery();
            if (set.next()){
                User user = new User(set.getString("username"), set.getString("password"), set.getString("email"));
                GlobalUser globalUser = new GlobalUser(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
