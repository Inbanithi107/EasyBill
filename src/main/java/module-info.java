module com.techforge.easybill {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.techforge.easybill to javafx.fxml;
    exports com.techforge.easybill;
}