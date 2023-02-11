package com.example.veg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Controller1_1 {

    @FXML
    private Button B1;

    @FXML
    private ImageView I1;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    void initialize() {
        System.out.println("Ошибка авторизации");
        B1.setOnAction(e -> {
            B1.getScene().getWindow().hide();
        });
    }
}