package com.example.tercerentrega_ppai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        //Scene es el main component de javaFX
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Consultar llamadas");
        stage.setScene(scene);
        stage.show();

        //Setear icono
        Image img = new Image("C:\\Users\\Alejo\\Documents\\tercerentrega_ppai\\src\\main\\resources\\media\\img-logo.png");
        stage.getIcons().add(img);
    }

    public static void main(String[] args) {
        launch();
    }
}