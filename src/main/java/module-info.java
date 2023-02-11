module com.example.veg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.veg to javafx.fxml;
    exports com.example.veg;
}