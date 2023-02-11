package com.example.veg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller4 {

    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(e -> {
            B1.getScene().getWindow().hide();
        });
    }
}

