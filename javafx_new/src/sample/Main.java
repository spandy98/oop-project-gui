package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
        this.stage = primaryStage;
        primaryStage.setTitle("Gallivanter");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setFullScreen(true);
        primaryStage.show();
        primaryStage.setResizable(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}


