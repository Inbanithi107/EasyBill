package com.techforge.easybill;

import com.techforge.easybill.Entity.Product;
import com.techforge.easybill.Service.ProductService;
import com.techforge.easybill.Service.SetupService;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @FXML
    private Button errorOkbutton;

    @FXML
    private Pane errorpane;

    @FXML
    private Button finishbutton;

    @FXML
    private TextField totalbillrate;

    private LocalDateTime time;

    int totalprice=0;

     SetupService service = new SetupService();



     List<Product> products = new ArrayList<>();

     Product globalproduct = new Product();

    com.techforge.easybill.Entity.Bill bill = new com.techforge.easybill.Entity.Bill();





    public void handleenterkey(KeyEvent keyEvent){
        if (keyEvent.getCode()== KeyCode.ENTER){
            handlekeyenter();
        }
    }

    public void handleshiftkey(KeyEvent event){
        if (event.getCode()==KeyCode.SHIFT){
            System.out.println("dgdgfd");
        }
    }

    @FXML
    public void initialize() {
        // Add listener for changes in the TextField
        productqty.textProperty().addListener((observable, oldValue, newValue) -> {
            totalrate.setText(String.valueOf(Integer.parseInt(productrate.getText()) * Integer.parseInt(newValue)));
        });
        Platform.runLater(() -> {
            productid.requestFocus();
        });

        bill.setDateTimeFromLocalDateTime(LocalDateTime.now());
        bill.setCustomerid(2);
        bill.setAdmin("inbanithi");
        bill.setRate(totalprice);

    }
    public void handlekeyenter(){
        if (productid.getText().isEmpty()){
             errorpane.setVisible(true);
        }

        service.getproduct(Integer.parseInt(productid.getText()), new SetupService.ProductCallback() {
            @Override
            public void onSuccess(Product product) {
                productid.setText(product.getId()+"");
                productname.setText(product.getName());
                productrate.setText(product.getPrice()+"");
                productmrp.setText(String.valueOf(product.getMrp()));
                productqty.setText("1");
                Platform.runLater(() -> {
                    productqty.requestFocus();
                });
                globalproduct = product;
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }

    public void handleprev(ActionEvent actionEvent) {
    }

    public void handlenext(ActionEvent actionEvent) {
          products.add(globalproduct);
         bill.setProducts(products);
         Platform.runLater(()->{
             productid.requestFocus();
         });

         totalprice=totalprice+Integer.parseInt(totalrate.getText());
         totalbillrate.setText(String.valueOf(totalprice));


    }

    public void handleerrorokbutton(ActionEvent actionEvent) {
        errorpane.setVisible(false);
    }

    public void handlefinish(ActionEvent actionEvent) throws IOException {
            bill.setRate(totalprice);
            service.savebill(bill);
    }
}
