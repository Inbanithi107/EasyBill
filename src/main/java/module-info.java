module com.techforge.easybill {
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.controls;
    requires com.google.gson;
    requires java.sql;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires okhttp3;
    opens com.techforge.easybill to javafx.fxml;
    opens com.techforge.easybill.Entity to com.google.gson;
    exports com.techforge.easybill.Entity;
    exports com.techforge.easybill;
}