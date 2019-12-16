package code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/layout/Year1Semester1Scene.fxml")), 1020, 700);
        scene.getStylesheets().add(getClass().getResource("/style/StyleSheet.css").toExternalForm());

        primaryStage.setTitle("ComSci Reminder - Year 1 Semester 1");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}