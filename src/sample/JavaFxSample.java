package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxSample extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        Circles c = new Circles();
        c.setRadius(100.0);
        c.setX_center(250);
        c.setY_center(400);
        c.setRotateSpeed(0.3);
        c.start(primaryStage);

        Rhombus r = new Rhombus();
        r.setX_center(200);
        r.setLength(100);
        r.setWidth(15);
        r.setY_center(100);
        r.setSpeed(0.2);
        r.start(primaryStage);

        Lines k =new Lines();
        k.start(primaryStage);

        CrossObstacle cX = new CrossObstacle();

        cX.setX_center(200);
        cX.setY_center(150);
        cX.setRotateSpeed(0.3);
        cX.start(primaryStage);


        Group froot= new Group( r.getRoot());
            Scene scene=new Scene(froot,600,600);
            scene.setFill(Color.DARKGRAY);
            primaryStage.setTitle("Ellipse");
            primaryStage.setScene(scene);
            primaryStage.show();


//        Lines k = new Lines();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
