/*
Program Name: Pr_34
Program Description: Registration form with validation.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Pr_34 extends Application {

    public void start(Stage stage) {

        GridPane g = new GridPane();

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();

        Button btn = new Button("Submit");

        g.add(new Label("Roll:"),0,0); g.add(roll,1,0);
        g.add(new Label("Name:"),0,1); g.add(name,1,1);
        g.add(new Label("Age:"),0,2); g.add(age,1,2);
        g.add(new Label("Email:"),0,3); g.add(email,1,3);
        g.add(btn,1,4);

        btn.setOnAction(e -> {
            try {
                Integer.parseInt(roll.getText());
                Integer.parseInt(age.getText());

                if(!email.getText().contains("@"))
                    throw new Exception("Invalid Email");

                new Alert(Alert.AlertType.INFORMATION,"Success").show();

            } catch(Exception ex) {
                new Alert(Alert.AlertType.ERROR, ex.getMessage()).show();
            }
        });

        stage.setScene(new Scene(g,300,200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
