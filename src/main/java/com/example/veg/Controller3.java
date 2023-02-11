package com.example.veg;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;


public class Controller3 {
    @FXML
    private TableView<Customer> tableView;

    @FXML
    private TableColumn<Customer, String> ageColumn;

    @FXML
    private TableColumn<Customer, Integer> numberColumn;

    @FXML
    private TableColumn<Customer, String> nameColumn;

    @FXML
    private TextField ageInput;

    @FXML
    private TextField nameInput;
    @FXML
    private TextField numberInput;

    @FXML
    private Button save;

    @FXML
    private Button B1;

    @FXML
    private Button B2;


    ObservableList<Customer> customers = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        B1.setOnAction(e -> {

            System.out.println("Заказ");

            Window5 window5 = new Window5();
            try {
                 window5.start(new Stage());
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(e -> {

            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        save.setOnAction(clik -> {
            try {
                String line = ("Название: "+" "+nameInput.getText()+" ");
                String line2=("Количество порций: "+ageInput.getText()+" ");
                String line3=("Номер столика: "+numberInput.getText()+" ");
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\roman\\Desktop\\Veg\\src\\data.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                buffer=line2.getBytes();
                fileOutputStream.write(buffer);
                buffer=line3.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Удачно сохранено");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        });

        nameColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Customer, String>("age"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("number"));
    }

    @FXML
    public void submit(ActionEvent event) {
        Customer customer = new Customer(nameInput.getText(),
                (ageInput.getText()),
                Integer.parseInt(numberInput.getText()));
        customers.add(customer);
        tableView.setItems(customers);
    }

    @FXML
    public void removeCustomer(ActionEvent event) {
        int selectedID = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedID);
    }



}
