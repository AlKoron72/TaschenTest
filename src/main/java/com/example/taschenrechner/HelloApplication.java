package com.example.taschenrechner;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane group = new GridPane();
        group.setPadding(new Insets(0, 10, 10, 10));

        Circle circle = new Circle(30);
        circle.setFill(Color.DARKRED);

        group.getChildren().addAll(circle);

        for (int i = 0; i <11 ; i++) {
            Button button = new Button(String.valueOf(i));
            button.setTranslateX((i%3)*60);
            button.setTranslateY((i%3)*48);
            button.setPrefWidth(48);
            button.setPrefHeight(40);

            clickButton(button);
            group.getChildren().add(button);
        }

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(group, 640, 480);
        stage.setTitle("Taschenrechner");
        stage.setScene(scene);
        stage.show();
    }

    public void clickButton (Button button){
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Hallo");
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}