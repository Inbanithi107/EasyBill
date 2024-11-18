package com.techforge.easybill;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.techforge.easybill.Entity.GlobalUser;
import com.techforge.easybill.Entity.User;
import com.techforge.easybill.Source.SQLiteConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
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

    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("/LoginImage.jpg"));
        imageview.setImage(image);
    }

    public void login(ActionEvent actionEvent) throws IOException {
        String usernamestring = username.getText();
        String passwordstring = password.getText();
        System.out.println();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setMaximized(true);
        stage.show();
    }
}
