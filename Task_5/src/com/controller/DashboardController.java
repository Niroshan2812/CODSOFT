package Task_5.src.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;

public class DashboardController {

    @FXML
    private void loadAddStudentView(ActionEvent event) {
        loadUI(event, "addStudent");
    }

    @FXML
    private void loadEditStudentView(ActionEvent event) {
        loadUI(event, "editStudent");
    }

    @FXML
    private void loadSearchStudentView(ActionEvent event) {
        loadUI(event, "searchStudent");
    }

    @FXML
    private void loadViewAllStudentView(ActionEvent event) {
        loadUI(event, "viewStudent");
    }

    public void loadUI(ActionEvent event, String fxmlName) {
        Node source = (Node) event.getSource();
        Scene scene = source.getScene();
        MainController mainController = (MainController) scene.getUserData();
        mainController.loadUi(fxmlName);
    }

}
