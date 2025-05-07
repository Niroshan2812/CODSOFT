package Task_5.src.com.controller;

import Task_5.src.com.model.Student;
import Task_5.src.com.searvice.StudentManagmentSystem;
import Task_5.src.com.util.DBinitilizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;



public class SearchStrudentController {
    @FXML private TextField searchField;
    @FXML private Label messageLabel;
    @FXML private Button searchButton;
    @FXML private TextArea showDetails;


@FXML
private void handleSearch() {
    String searchTerm = searchField.getText().trim();

    if(searchTerm.isEmpty()){
        messageLabel.setText("Please enter a search term");
        showDetails.setText("");
        return;
    }
    Student student = StudentManagmentSystem.getStudentByRollNumber(searchTerm);
    if(student != null){
        showDetails.setText("Roll Number: "+ student.getRollNumber() + "\n"+
                "Name: "+ student.getName() + "\n" +
                "Grade: "+ student.getGrade() + "\n"+
                "Contact Number: "+ student.getContactNumber()+ "\n"+
                "Email: "+ student.getEmail()
                );
        messageLabel.setText("");
    }else {
        showDetails.setText("");
        messageLabel.setText("Student not found");
    }



}

@FXML
    private void backtoDashboard(ActionEvent event) {
    DashboardController dashboard = new DashboardController();
    dashboard.loadUI(event,"dashbord");


}

}

