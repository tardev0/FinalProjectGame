package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ResumeMenu extends Application {

    public void start(Stage primaryStage) throws Exception {

        Image play = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFl9A3rwXuPSSnC_VFJn0AlPPGe1BCg1gGWg&usqp=CAU", false);
        ImageView playI = new ImageView(play);
        Circle ci = new Circle();
        ci.setCenterX(310);
        ci.setCenterY(200);
        ci.setRadius(80);
        ci.setFill(new ImagePattern(play));


        Button btn1 = new Button();
        btn1.setStyle("-fx-font-size: 25; -fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-border-color: #ffffff");

        btn1.setText("GAME 0");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
            }
        });

        Pane but1root = new Pane();
        btn1.setLayoutX(240);
        btn1.setLayoutY(320);
        but1root.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("GAME 1");
        btn2.setStyle("-fx-font-size: 25;-fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-border-color: #ffffff");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
            }
        });

        Pane but2root = new Pane();
        btn2.setLayoutX(240);
        btn2.setLayoutY(400);
        but2root.getChildren().add(btn2);


        Button btn3 = new Button();
        btn3.setText("GAME 2");
        btn3.setStyle("-fx-font-size: 25;-fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-border-color: #ffffff");
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
            }
        });

        Pane but3root = new Pane();
        btn3.setLayoutX(240);
        btn3.setLayoutY(480);
        but3root.getChildren().add(btn3);



        Group froot = new Group(ci, but1root, but2root, but3root);
        Scene scene = new Scene(froot, 600, 600);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
