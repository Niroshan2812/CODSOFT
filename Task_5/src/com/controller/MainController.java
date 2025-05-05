package Task_5.src.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private StackPane centerBox;

    private void setCenterContent (String fxmlPath) throws IOException {
        Parent view = FXMLLoader.load(getClass().getResource(fxmlPath));
        centerBox.getChildren().clear();
        centerBox.getChildren().add(view);
    }

    @FXML
    private void loadAddStudentView(ActionEvent event) throws IOException {
        setCenterContent(  "../../resource/addStudent.fxml");

    }

    @FXML
    private void loadEditStudentView(ActionEvent event) throws IOException {
        setCenterContent(  "../../resource/editStudent.fxml");
       // Parent view = FXMLLoader.load(getClass().getResource("../../resource/editStudent.fxml"));
      //  mainBorderPane.setCenter(view);
    }
    @FXML
    private void loadSearchStudentView(ActionEvent event) throws IOException {
        setCenterContent(  "../../resource/searchStudent.fxml");
       // Parent view = FXMLLoader.load(getClass().getResource("../../resource/searchStudent.fxml"));
       // mainBorderPane.setCenter(view);
    }
    @FXML
    private void loadViewAllStudentView(ActionEvent event) throws IOException {
        setCenterContent(  "../../resource/viewStudent.fxml");
      //  Parent view = FXMLLoader.load(getClass().getResource("../../resource/viewStudent.fxml"));
      //  mainBorderPane.setCenter(view);

    }
}
