package Task_5.src.com.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.util.stream.Stream;

public class AddStudentController {
    @FXML private TextField rollField;
    @FXML private TextField nameField;
    @FXML private TextField gradeField;
    @FXML private TextField contactField;
    @FXML private TextField emailField;
    @FXML private Label messageLabel;


    @FXML
    private void handleSave(){
        String rollNum = rollField.getText().trim();
        String name = nameField.getText().trim();
        String grade = gradeField.getText().trim();
        String contactNumber = contactField.getText().trim();
        String email = emailField.getText().trim();


        boolean anyEmpty = Stream.of(rollNum, name, grade, contactNumber, email).anyMatch(String ::isEmpty);

        if(anyEmpty){
            messageLabel.setText("Please fill all the fields");
            return;
        }

        System.out.println(rollNum + " " + name + " " + grade + " " + contactNumber + " " + email);

    }

    @FXML
    private void handleClose(){
        // Need to goback to home page
    }
}
