package Task_5.src.com.controller;

import Task_5.src.com.searvice.StudentManagmentSystem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Task_5.src.com.model.Student;
import javafx.scene.control.Label;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewStudentDetails {

    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> rollNumber;
    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> grade;
    @FXML
    private TableColumn<Student, Integer> contactNumber;
    @FXML
    private TableColumn<Student, String> email;

   @FXML
   private Label messageLabel;

    @FXML
    public void initialize() {
        rollNumber.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getRollNumber()));
        name.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getName()));
        grade.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getGrade()));
        contactNumber.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getContactNumber()).asObject());
        email.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getEmail()));

        loadStudentData();
    }

    private void loadStudentData() {
        ObservableList<Student> studentList = FXCollections.observableArrayList(StudentManagmentSystem.getAllStudents());
        if (studentList.isEmpty()) {
            messageLabel.setText("No student records found.");
        } else {
            studentTable.setItems(studentList);
        }
    }

    @FXML
    private void backtoDashboard(ActionEvent event) {
        DashboardController dashboard = new DashboardController();
        dashboard.loadUI(event,"dashbord");


    }

}
