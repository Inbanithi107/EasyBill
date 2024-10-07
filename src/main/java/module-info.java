module com.techforge.easybill {
    requires javafx.fxml;
    requires java.sql;
    requires com.jfoenix;
    requires javafx.controls;


    opens com.techforge.easybill to javafx.fxml;
    exports com.techforge.easybill;
}