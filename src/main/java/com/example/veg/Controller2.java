package com.example.veg;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.FileOutputStream;
import java.io.IOException;

public class Controller2 {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;
    @FXML
    private Button B4;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private TextField TF3;

    @FXML
    void initialize(){
        B1.setOnAction(e -> {
            Window1 window1 = new Window1();
            try {
                window1.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Авторизация");
        });

        B2.setOnAction(clik -> {
            try {
                String line=(TF1.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\roman\\Desktop\\Veg\\src\\inputname.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Имя сохранено");
            } catch (Exception e) {
                System.out.println("Имя не удалось сохранить");
            }
        });

        B3.setOnAction(clik -> {
            try {
                String line=(TF2.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\roman\\Desktop\\Veg\\src\\inputlogin.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Логин сохранён");
            } catch (Exception e) {
                System.out.println("Логин не удалось сохранить");
            }
        });

        B4.setOnAction(clik -> {
            try {
                String line=(TF3.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\roman\\Desktop\\Veg\\src\\inputpass.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Пароль сохранён");
            } catch (Exception e) {
                System.out.println("Пароль не удалось сохранить");
            }
        });
    }

}