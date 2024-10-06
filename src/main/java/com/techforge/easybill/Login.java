package com.techforge.easybill;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Login {

    @FXML
    private ImageView imageview;

    public void initialize(){
        Image image = new Image(getClass().getResourceAsStream("/LoginImage.jpg"));
        imageview.setImage(image);
    }
}
