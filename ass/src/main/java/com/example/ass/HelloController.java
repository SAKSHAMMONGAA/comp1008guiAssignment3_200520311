package com.example.ass;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

public class HelloController {

    @FXML
    private TextField Bcha1;

    @FXML
    private Button Button;

    @FXML
    private Label error;

    @FXML
    private TextField Bcha2;

    @FXML
    private TextField Bcha3;
    @FXML
    private ColorPicker rang;

    @FXML
    private TextField Bcha4;

    @FXML
    private Label rng;

    @FXML
    private TextField Bcha5;

    @FXML
    private TextField Bcha6;

    @FXML
    private TextField Student;

    @FXML
    private TextField Bcha7;

    @FXML
    private TextField Bcha8;

    @FXML
    private TextField Bcha9;

    @FXML
    private Pane xx1;

    @FXML
    private Pane xx3;

    @FXML
    private Pane xx2;

    @FXML
    private Pane xx5;

    @FXML
    private Pane xx4;

    @FXML
    private Pane xx7;

    @FXML
    private Pane xx6;

    @FXML
    private Pane xx9;

    @FXML
    private Pane xx8;

    @FXML
    private Label nam;



        @FXML
        void onButtonClick(ActionEvent event){

            ArrayList<String> lists = new ArrayList<>();
            lists.add("xx1");
            lists.add("xx2");
            lists.add("xx3");
            lists.add("xx4");
            lists.add("xx5");
            lists.add("xx6");
            lists.add("xx7");
            lists.add("xx8");
            lists.add("xx9");



            error.setText("");

            System.out.println("You clicked on 'Choose Seat' ");

            // variables to get data
            String receivedStudentName = Student.getText();
            Color colorset = rang.getValue();

           ;
            if (receivedStudentName.equals("")) {
                error.setText("Enter name of student");

            } else {

                Random random = new Random();
                int rand = random.nextInt(0, 9);
                System.out.println(rand);


                //  first seat
                if (lists.get(rand).equals("xx1") && Bcha1.getText().isEmpty()) {
                    Bcha1.setText(receivedStudentName);
                    xx1.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                    error.setText("Seat has taken");
                    // lists.remove(rand);
                } else if (Bcha1.getText() != ("") && lists.get(rand).equals("xx1")) {
                    error.setText("Seat is already full. select another seat.");
                }


                // second seat
                else if (lists.get(rand).equals("xx2") && Bcha2.getText().isEmpty()) {
                    Bcha2.setText(receivedStudentName);
                    xx2.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                    error.setText("Seat is already selected");

                } else if (Bcha2.getText() != ("") && lists.get(rand).equals("xx2")) {
                    error.setText("Seat is already full. select another seat");
                }

                // third seat
                else if (lists.get(rand).equals("xx3") && Bcha3.getText().isEmpty()) {
                    Bcha3.setText(receivedStudentName);
                    xx3.setStyle("-fx-background-color: #" + colorset.toString().substring(2));

                } else if (Bcha3.getText() != ("") && lists.get(rand).equals("xx3")) {
                    error.setText("Seat is already full. select another seat");
                }

                // fourth seat
                else if (lists.get(rand).equals("xx4") && Bcha4.getText().isEmpty()) {
                    Bcha4.setText(receivedStudentName);
                    xx4.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                    error.setText("Seat is already selected");

                } else if (Bcha4.getText() != ("") && lists.get(rand).equals("xx4")) {
                    error.setText("Seat is already full. select another seat");
                }

                // fifth seat
                else if (lists.get(rand).equals("xx5") && Bcha5.getText().isEmpty()) {
                    Bcha5.setText(receivedStudentName);
                    xx5.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                    error.setText("Seat is already selected");

                } else if (Bcha5.getText() != ("") && lists.get(rand).equals("xx5")) {
                    error.setText("Seat is already full. select another seat");
                }

                // sixth seat
                else if (lists.get(rand).equals("xx6") && Bcha6.getText().isEmpty()) {
                    Bcha6.setText(receivedStudentName);
                    xx6.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                   error.setText("Seat is already selected");

                } else if (Bcha6.getText() != ("") && lists.get(rand).equals("xx6")) {
                    error.setText("Seat is already full. select another seat");
                }

                // seven seat
                else if (lists.get(rand).equals("xx7") && Bcha7.getText().isEmpty()) {
                    Bcha7.setText(receivedStudentName);
                    xx7.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                  error.setText("Seat is already selected");

                } else if (Bcha7.getText() != ("") && lists.get(rand).equals("xx7")) {
                    error.setText("Seat is already full. select another seat");
                }

                // eighted seat
                else if (lists.get(rand).equals("xx8") && Bcha8.getText().isEmpty()) {
                    Bcha8.setText(receivedStudentName);
                    xx8.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                   error.setText("Seat is already selected");

                } else if (Bcha8.getText() != ("") && lists.get(rand).equals("xx8")) {
                    error.setText("Seat is already full. select another seat");
                }

                // ninth seat
                else if (lists.get(rand).equals("xx9") && Bcha9.getText().isEmpty()) {
                    Bcha9.setText(receivedStudentName);
                    xx9.setStyle("-fx-background-color: #" + colorset.toString().substring(2));
                    error.setText("Seat is already selected");

                } else if (Bcha9.getText() != ("") && lists.get(rand).equals("xx9")) {
                    error.setText("Seat is already full. select another seat");
                }
            }

        }
    }