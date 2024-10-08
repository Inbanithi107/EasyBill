package com.techforge.easybill;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Home {

    public void billmain(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Bill.fxml"));
        Stage stage = new Stage();
        stage.setMaximized(true);
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
