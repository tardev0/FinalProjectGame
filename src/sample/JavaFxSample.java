package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxSample extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{


        Label l1 = new Label();
        l1.setStyle("-fx-font-size: 25; -fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-border-color: #000000");
        l1.setText("54");
        Pane l1root = new Pane();
        l1.setLayoutX(20);
        l1.setLayoutY(15);
        l1root.getChildren().add(l1);

        Button btn1 = new Button();
        btn1.setStyle("-fx-font-size: 25; -fx-background-color: #000000; -fx-text-fill: #ffffff; -fx-border-color: #000000");

        btn1.setText("|  |");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
            }
        });

        Pane but1root = new Pane();
        btn1.setLayoutX(495);
        btn1.setLayoutY(5);
        but1root.getChildren().add(btn1);

        Image im = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Whitestar_black.svg/1200px-Whitestar_black.svg.png",false);
        ImageView title = new ImageView(im);
        title.setX(275);
        title.setY(680);
        title.setFitHeight(50);
        title.setFitWidth(50);
        title.setPreserveRatio(true);


        ImageView title1 = new ImageView(im);
        title1.setX(275);
        title1.setY(125);
        title1.setFitHeight(50);
        title1.setFitWidth(50);
        title1.setPreserveRatio(true);

        Rhombus r = new Rhombus();
        r.setX_center(250);
        r.setLength(100);
        r.setWidth(15);
        r.setY_center(100);
        r.setSpeed(0.2);
        r.start(primaryStage);

        CrossObstacle cX = new CrossObstacle();
        cX.setX_center(300);
        cX.setY_center(400);
        cX.setRotateSpeed(0.3);
        cX.start(primaryStage);


        Circles c = new Circles();
        c.setRadius(100.0);
        c.setX_center(300);
        c.setY_center(700);
        c.setAngle(360);
        c.setRotateSpeed(0.1);
        c.start(primaryStage);


        Circles c1 = new Circles();
        c1.setRadius(120.0);
        c1.setX_center(300);
        c1.setY_center(700);
        c1.setAngle(-360);
        c1.setRotateSpeed(0.1);
        c1.start(primaryStage);



        Group froot= new Group( r.getRoot(), cX.getRoot(),c.getRoot(),c1.getRoot(),l1root,but1root,title,title1);
            Scene scene=new Scene(froot,600,900);
            scene.setFill(Color.BLACK);
            primaryStage.setTitle("Ellipse");
            primaryStage.setScene(scene);
            primaryStage.show();




//        Lines k = new Lines();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
