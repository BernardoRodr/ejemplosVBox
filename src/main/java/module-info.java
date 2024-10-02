module com.example.ejemplosvbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplosvbox to javafx.fxml;
    exports com.example.ejemplosvbox;
}