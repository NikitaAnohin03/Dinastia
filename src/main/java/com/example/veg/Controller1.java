package com.example.veg;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Controller1 {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private PasswordField PF1;

    @FXML
    private TextField TF1;

    @FXML
    void initialize() {

        B1.setOnAction(event -> {
            System.out.println("Логин: " + TF1.getText());
            System.out.println("Пароль: " + PF1.getText());

            try {
                BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\roman\\Desktop\\Veg\\src\\inputlogin.txt")) {
                };
                BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\roman\\Desktop\\Veg\\src\\inputpass.txt")) {
                };
                String line1;
                String line2;
                while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                    if (line1.equals(TF1.getText().trim()) && line2.equals(PF1.getText().trim())) {
                        try {
                            Window3 window3 = new Window3();
                            try {
                                window3.start(new Stage());
                                B1.getScene().getWindow().hide();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Авторизация правильная");
                    } else {
                        Window1_1 window1_1 = new Window1_1();
                        try {
                            window1_1.start(new Stage());
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        System.out.println("Авторизация неправильная");
                    }
                }

            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });


        B2.setOnAction(e -> {

            System.out.println("Регистрация");

            Window2 window2 = new Window2();
            try {
                window2.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
