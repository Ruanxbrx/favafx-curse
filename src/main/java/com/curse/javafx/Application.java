package com.curse.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("view.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}