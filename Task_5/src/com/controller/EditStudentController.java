package Task_5.src.com.controller;

import Task_5.src.com.model.Student;
import Task_5.src.com.searvice.StudentManagmentSystem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class EditStudentController {
    @FXML private TextField searchField;
    @FXML private TextField nameField;
    @FXML private TextField gradeField;
    @FXML private TextField contactNumberField;
    @FXML private TextField emailField;
    @FXML private Label messageLabel;
    @FXML private Button editButton;

    private Student currantStudent;
    @FXML
    private void handleSearch(){
        String roll = searchField.getText().trim();
        if(roll.isEmpty()){
            messageLabel.setText("Please enter a roll number");
            return;
        }
        currantStudent = StudentManagmentSystem.getStudentByRollNumber(roll);

        if(currantStudent != null){
            nameField.setText(currantStudent.getName());
            gradeField.setText(currantStudent.getGrade());
            contactNumberField.setText(String.valueOf(currantStudent.getContactNumber()));
            emailField.setText(currantStudent.getEmail());
            releaseDisable();
            messageLabel.setText("");
        }else {
            messageLabel.setText("Student not found");
            handleClear();
        }
    }
    @FXML
    private void handleEdit(){
        if(currantStudent == null){
            messageLabel.setText("Please select a student");
            return;
        }

        String newName = nameField.getText().trim();
        String newGrade = gradeField.getText().trim();
        String newContactNumber = contactNumberField.getText().trim();
        String newEmail = emailField.getText().trim();

        if(newName.isEmpty() || newGrade.isEmpty()){
            messageLabel.setText("Name and grade are required");
            return;
        }
        currantStudent.setName(newName);
        currantStudent.setGrade(newGrade);
        currantStudent.setContactNumber(Integer.parseInt(newContactNumber));
        currantStudent.setEmail(newEmail);

        StudentManagmentSystem.updateStudents(currantStudent);
        messageLabel.setText("Student has been updated");
    }
    @FXML
    private void handleClear(){
        searchField.clear();
        nameField.clear();
        gradeField.clear();

    }
    private void releaseDisable(){
        nameField.setDisable(false);
        gradeField.setDisable(false);
        contactNumberField.setDisable(false);
        emailField.setDisable(false);
        editButton.setDisable(false);

    }

    @FXML
    private void backtoDashboard(ActionEvent event) {
        DashboardController dashboard = new DashboardController();
        dashboard.loadUI(event,"dashbord");
    }

private void view(){
        System.out.println(StudentManagmentSystem.getAllStudents());

}

@FXML
    private void printall(){
        StudentManagmentSystem.printAldlStudents();

}

}
