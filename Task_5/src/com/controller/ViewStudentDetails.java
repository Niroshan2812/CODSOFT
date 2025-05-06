package Task_5.src.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ViewStudentDetails {



    @FXML
    private void backtoDashboard(ActionEvent event) {
        DashboardController dashboard = new DashboardController();
        dashboard.loadUI(event,"dashbord");


    }

}
