/*
Program Name: Pr_35
Program Description: Displays percentage bar chart using rectangles.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Pr_35 extends Application {

    public void start(Stage stage) {

        HBox root = new HBox(20);

        root.getChildren().add(createBar("Projects",20,Color.RED));
        root.getChildren().add(createBar("Quiz",10,Color.BLUE));
        root.getChildren().add(createBar("Midterm",30,Color.GREEN));
        root.getChildren().add(createBar("Final",40,Color.ORANGE));

        stage.setScene(new Scene(root,400,300));
        stage.show();
    }

    VBox createBar(String name,int value,Color color) {
        Rectangle r = new Rectangle(40,value*3);
        r.setFill(color);

        Label l = new Label(name + " " + value + "%");

        return new VBox(r,l);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
