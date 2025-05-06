package Task_5.src.com.controller;

import Task_5.src.com.Main;
import Task_5.src.com.model.Student;
import Task_5.src.com.searvice.StudentManagmentSystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
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
        try{
            int contact = Integer.parseInt(contactNumber);
            Student student = new Student(rollNum, name, grade, contact, email);
            StudentManagmentSystem.addStudent(student);
            messageLabel.setText("Student added");
            handleClean();

        }catch (Exception e){
            messageLabel.setText("Student not added");
        }
    }
    @FXML
    private void handleClose(){
        // Need to goback to home page
    }

    private void handleClean(){
        rollField.clear();
        nameField.clear();
        gradeField.clear();
        contactField.clear();
        emailField.clear();
    }

    @FXML
    private void backtoDashboard(ActionEvent event) throws IOException {
        DashboardController dashboard = new DashboardController();
        dashboard.loadUI(event,"dashbord");

    }

}
