package com.mycompany.shapeexample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0; 
        
        final int X1 = 10, Y1 = 10;
        final int X2 = 60, Y2 = 60;
        final int X3 = 110, Y3 = 110; 
        
        final int WIDTH1 = 500, HEIGHT1 = 500;
        final int WIDTH2 = 400, HEIGHT2 = 400;
        final int WIDTH3 = 300, HEIGHT3 = 300;
        
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;
        Circle blackCircle = new Circle(CENTER_X, CENTER_Y, RADIUS);
        blackCircle.setFill(Color.BLACK);
        
        Rectangle r1 = new Rectangle(WIDTH1, HEIGHT1);
        r1.setFill(null);
        r1.setX(X1);
        r1.setY(Y1);
        r1.setStroke(Color.BLACK);
        
        Rectangle r2 = new Rectangle(WIDTH2, HEIGHT2);
        r2.setFill(null);
        r2.setX(X2);
        r2.setY(Y2);
        r2.setStroke(Color.BLACK);
        
        Rectangle r3 = new Rectangle(WIDTH3, HEIGHT3);
        r3.setFill(null);
        r3.setX(X3);
        r3.setY(Y3);
        r3.setStroke(Color.BLACK);
        
//        Line line1 = new Line(X1, Y1, X3, Y3); 
//        Line line2 = new Line();
//        Line line3 = new Line();
//        Line line4 = new Line();

        Pane root = new Pane();
        root.getChildren().addAll(blackCircle, r1, r2, r3);
        
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Using Circle");
        stage.show();	
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}