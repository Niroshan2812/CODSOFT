package Task_5.src.com.controller;

import Task_5.src.com.model.Student;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.awt.*;

public class EditStudentController {
    @FXML private TextField searchField;
    @FXML private TextField nameField;
    @FXML private TextField gradeField;
    @FXML private Label messageLabel;
    @FXML private Button editButton;

    private Student currantStudent;
    @FXML
    private void handleSearch(){
        String roll = searchField.getText().trim();

        if(roll.isEmpty()){
            messageLabel.setText("Please enter a roll");
            return;
        }
        // do Editable part
        System.out.println(roll);



    }
    @FXML
    private void handleEdit(){
        String newName = nameField.getText().trim();
        String newGrade = gradeField.getText().trim();

        if(newName.isEmpty() || newGrade.isEmpty()){
            messageLabel.setText("Name and grade are required");
            return;
        }
        // do handle edit part
        System.out.println(newName + " " + newGrade);
    }

    @FXML
    private void handleClear(){
        searchField.clear();
        nameField.clear();
        gradeField.clear();
        messageLabel.setText("");


    }

    private void releaseDisable(){
        nameField.setDisable(false);
        gradeField.setDisable(false);
        editButton.setDisable(false);
    }



}
