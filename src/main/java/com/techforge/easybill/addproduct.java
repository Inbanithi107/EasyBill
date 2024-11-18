package com.techforge.easybill;

import com.techforge.easybill.Entity.Product;
import com.techforge.easybill.Service.SetupService;
import com.techforge.easybill.Source.SQLiteConnection;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class addproduct {

    @FXML
    private TextField productname;

    @FXML
    private TextField productrate;

    @FXML
    private TextField productmrp;

    @FXML
    private TextField productbarcode;

    private SetupService service = new SetupService();

    public void handleaddbutton() {
        String name = productname.getText();
        int rate = Integer.parseInt(productrate.getText());
        int mrp = Integer.parseInt(productmrp.getText());
        String barcode = productbarcode.getText();
        Product product = new Product();
        product.setName(name);
        product.setMrp(mrp);
        product.setPrice(rate);
        product.setBarcode(barcode);
        service.addproduct(product);
        productbarcode.setText(null);
        productmrp.setText(null);
        productname.setText(null);
        productrate.setText(null);
    }

}
