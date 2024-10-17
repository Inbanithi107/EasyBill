package com.techforge.easybill;

import com.techforge.easybill.Entity.Product;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Bill {

    @FXML
     private TextField productid;

    @FXML
    private TextField productname;

    @FXML
    private TextField productrate;

    @FXML
    private TextField productmrp;

    @FXML
    private TextField productqty;

    @FXML
    private TextField totalrate;

    public void handleenterkey(KeyEvent keyEvent){
        if (keyEvent.getCode()== KeyCode.ENTER){
            handlekeyenter();
        }
    }

    public void handlekeyenter(){
        if (productid.getText().isEmpty()){

        }



    }

}
