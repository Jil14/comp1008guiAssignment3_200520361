package com.example.week10in;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

public class FinalAssignmentController {

    @FXML
    private ColorPicker colorchoosen;

    @FXML
    private Label erralert;

    @FXML
    private TextField nameOfStudent;

    @FXML
    private Pane position1;

    @FXML
    private Pane position2;

    @FXML
    private Pane position3;

    @FXML
    private Pane position4;

    @FXML
    private Pane position5;

    @FXML
    private Pane position6;

    @FXML
    private Pane position7;

    @FXML
    private Pane position8;

    @FXML
    private Pane position9;

    @FXML
    private Text stu1;

    @FXML
    private Text stu2;

    @FXML
    private Text stu3;

    @FXML
    private Text stu4;

    @FXML
    private Text stu5;

    @FXML
    private Text stu6;

    @FXML
    private Text stu7;

    @FXML
    private Text stu8;

    @FXML
    private Text stu9;



    ArrayList<Integer> arrlist = new ArrayList<Integer>(10);

    int count = 0;
    int er = 0;


    int randomFunction(int randomnum) {

        while (true) {
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int r1 = (int) (Math.random() * range) + min;

            if (arrlist.contains(r1)) {
                continue;
            } else {
                arrlist.add(r1);

                return r1;

            }
        }
    }


    @FXML
    void onAddStudent(ActionEvent event) {
        Random ran = new Random();
        int error = 0;
        String name = nameOfStudent.getText();
        Color color = colorchoosen.getValue();

        int randomnum = ran.nextInt(1, 10);

        int randomNum = randomFunction(randomnum);


        if (stu1.getText().compareTo(name) == 0 || stu2.getText().compareTo(name) == 0 || stu3.getText().equals(name)
                || stu4.getText().equals(name) || stu5.getText().equals(name) || stu6.getText().equals(name) ||
                stu7.getText().equals(name) || stu8.getText().equals(name) || stu9.getText().equals(name)) {
            error = 1;
            arrlist.remove(arrlist.indexOf(randomNum));
        }

        if (color.toString().equals("0xffffffff")) {
            error = 2;
        }
        if (position1.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))) {

            error = 2;
        }
        if (position2.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)))
        {
            error = 2;
        }
        if (position3.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)))
        {
            error = 2;
        }
        if (position4.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)))
        {
            error = 2;
        }
        if (position5.getStyle().equals("-fx-background-color: #" + color.toString().substring(2)))
        {
            error = 2;
        }
        if (position6.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))) {
            error = 2;
        }
        if (position7.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))) {
            error = 2;
        }
        if (position8.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))) {
            error = 2;
        }
        if (position9.getStyle().equals("-fx-background-color: #" + color.toString().substring(2))) {
            error = 2;
        }
        if (name.isEmpty()) {
            error = 6;
            erralert.setText("Please enter name");
            erralert.setVisible(true);
            arrlist.remove(randomNum);
            arrlist.remove(arrlist.indexOf(randomNum));

        }


        if (error == 0) {
            count++;
            if (randomNum == 1) {
                erralert.setVisible(false);
                position1.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu1.setText(name);
                stu1.setVisible(true);

                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 2) {
                erralert.setVisible(false);
                position2.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu2.setText(name);
                stu2.setVisible(true);
                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 3) {
                erralert.setVisible(false);
                position3.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu3.setText(name);
                stu3.setVisible(true);
                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 4) {
                erralert.setVisible(false);
                position4.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu4.setText(name);
                stu4.setVisible(true);
                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 5) {
                erralert.setVisible(false);
                position5.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu5.setText(name);
                stu5.setVisible(true);
                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 6) {
                erralert.setVisible(false);
                position6.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu6.setText(name);
                stu6.setVisible(true);

                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;

                }

            }
            if (randomNum == 7) {
                erralert.setVisible(false);
                position7.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu7.setText(name);
                stu7.setVisible(true);

                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 8) {
                erralert.setVisible(false);
                position8.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu8.setText(name);
                stu8.setVisible(true);

                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");
                    er = 20;
                }

            }
            if (randomNum == 9) {
                erralert.setVisible(false);
                position9.setStyle("-fx-background-color: #" + color.toString().substring(2));
                stu9.setText(name);
                stu9.setVisible(true);

                if (count == 9) {
                    erralert.setVisible(true);
                    erralert.setText("CONGRATULATIONS! SEATS TAKEN");

                }
            }

            System.out.println(count);


        } else if (error == 1) {
            erralert.setText("STUDENT NAME TAKEN!!");
            erralert.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            erralert.setVisible(true);
            arrlist.remove((Integer) randomNum);

        } else if (error == 2) {
            erralert.setText("INVALID COLOR");
            erralert.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            erralert.setVisible(true);
            arrlist.remove(arrlist.indexOf(randomNum));

        } else {
            erralert.setVisible(false);
            erralert.setText("SEATS ARE FULL!!");
            erralert.setStyle("-fx-background-color: rgba(255,0,0,.3)");
            erralert.setVisible(true);

        }


    }

    @FXML
    void initialize() {
        stu1.setVisible(false);
        stu3.setVisible(false);
        stu2.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        erralert.setVisible(false);
    }

}