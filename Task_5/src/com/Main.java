package Task_5.src.com;

import Task_5.src.com.controller.MainController;
import Task_5.src.com.util.DBinitilizer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resource/home.fxml"));
        Parent root = fxmlLoader.load();
        MainController controller = fxmlLoader.getController();

        Scene scene = new Scene(root, 600,520);
        scene.setUserData(controller);

        primaryStage.setTitle("Student Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();

        /*

        Parent root = FXMLLoader.load(getClass().getResource("../resource/home.fxml"));
        primaryStage.setTitle("Task 5");
        primaryStage.setScene(new Scene(root, 600,520));
        primaryStage.show();

         */
    }
    public static void main(String[] args) {
        DBinitilizer.createDatabace();
        launch(args);
    }
}
