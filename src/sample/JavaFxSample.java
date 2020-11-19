package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxSample extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        Circles c = new Circles();
        c.setRadius(100.0);
        c.setX_center(250);
        c.setY_center(300);
        c.setRotateSpeed(0.3);
        c.start(primaryStage);

        Scene scene=new Scene(c.getRoot() ,600,600);
        scene.setFill(Color.DARKGRAY);
        primaryStage.setTitle("Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
