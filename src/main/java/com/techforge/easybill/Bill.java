package com.techforge.easybill;

import com.techforge.easybill.Entity.Product;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Bill {

    @FXML
    private TableView<Product> tableView;

    @FXML
    private TableColumn<Product, Integer> tableid;

    @FXML
    private TableColumn<Product, String> tableitem;

    @FXML
    private TableColumn<Product, Integer> tableqty;

    @FXML
    private TableColumn<Product, Integer> tableprice;

    @FXML
    private TableColumn<Product, Integer> tablerate;

    public void initialize(){
        tableid.setCellValueFactory(new PropertyValueFactory<>("id"));

        tableid.setCellValueFactory(new PropertyValueFactory<>("name"));

        tableid.setCellValueFactory(new PropertyValueFactory<>("qty"));

        tableid.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableid.setCellValueFactory(new PropertyValueFactory<>("rate"));

        ObservableList<Product> products = FXCollections.observableArrayList(
                new Product(1, "Apple", "25", 50),
                new Product(2, "Biscuit", "250", 80),
                new Product(3, "Icecream", "205", 100)
        );
        tableView.setItems(products);
    }

}
