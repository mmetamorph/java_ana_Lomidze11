module com.example.java_ana_lomidze {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;


    opens com.example.java_ana_lomidze to javafx.fxml;
    exports com.example.java_ana_lomidze;
    exports application;
    opens application to javafx.fxml;
}