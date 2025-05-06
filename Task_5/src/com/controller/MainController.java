package Task_5.src.com.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane centerBox;
    @FXML
    public void initialize() {
        loadUi("dashbord");
    }
    public void loadUi(String fxmlName) {
        try{
            Node node = FXMLLoader.load(getClass().getResource("../../resource/"+fxmlName+".fxml" ));
            centerBox.getChildren().setAll(node);

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
