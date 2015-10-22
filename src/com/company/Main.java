package com.company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Main extends Application {



        public void start (Stage primaryStage)throws Exception {
            Button btOK = new Button("Click Me");
            Scene scene = new Scene(btOK, 200, 250);
            primaryStage.setTitle("My First Demo");
            primaryStage.setScene(scene);
            primaryStage.show();

            Stage stage = new Stage();
            stage.setTitle("Second Stage");
            stage.setScene(new Scene(new Button("New Stage"), 100, 100));
            stage.show();
        }
    }



