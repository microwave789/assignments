package com.example.demo4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class homework_5 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        boolean isBlack = false;
        int i = 0;
        while (i < 8) {
            for (int j = 0; j < 8; j++) {
                Rectangle rec = new Rectangle(50, 50, (isBlack) ? Color.BLACK : Color.WHITE);
                pane.add(rec,j,i);
                isBlack = !isBlack;
            }
            isBlack = !isBlack;
            i++;
        }
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkerboard");
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(400);
        primaryStage.show();
    }
}