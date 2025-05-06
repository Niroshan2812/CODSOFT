package Task_5.src.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;



public class SearchStrudentController {
    @FXML private TextField searchField;
    @FXML private Label ShowDetails;
    @FXML private Label messageLabel;
    @FXML private Button searchButton;


@FXML
private void handleSearch() {
    String searchTerm = searchField.getText().trim();

    if(searchTerm.isEmpty()){
        messageLabel.setText("Please enter a search term");
    }


}

@FXML
    private void backtoDashboard(ActionEvent event) {
    DashboardController dashboard = new DashboardController();
    dashboard.loadUI(event,"dashbord");


}

}

