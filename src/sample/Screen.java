package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Screen extends Application {


    @Override
        public void start(Stage primaryStage) throws Exception{

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(10);
        gridpane.setVgap(10);

        Label label = new Label("Label");
        GridPane.setHalignment(label, HPos.CENTER);
        gridpane.add(label, 0, 0);
        Group root = new Group();
        root.getChildren().add(gridpane);

            Circles c = new Circles();
            c.setRadius(100.0);
            c.setX_center(300);
            c.setY_center(300);
            c.setAngle(360);
            c.setRotateSpeed(0.1);
            c.start(primaryStage);


            Circles c1 = new Circles();
            c1.setRadius(120.0);
            c1.setX_center(300);
            c1.setY_center(300);
            c1.setAngle(-360);
            c1.setRotateSpeed(0.1);
            c1.start(primaryStage);

            Rhombus n = new Rhombus();
            n.setX_center(250);
            n.setY_center(250);
            n.setLength(100);
            n.setWidth(15);
            n.setSpeed(0.3);

            Image im = new Image("https://www.dafont.com/forum/attach/orig/8/8/885774.png?1",false);
            ImageView title = new ImageView(im);
            title.setX(200);
            title.setY(25);
            title.setFitHeight(150);
            title.setFitWidth(200);
            title.setPreserveRatio(true);

        Image play = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFl9A3rwXuPSSnC_VFJn0AlPPGe1BCg1gGWg&usqp=CAU",false);
        ImageView playI = new ImageView(play);
        Circle ci = new Circle();
        ci.setCenterX(300);
        ci.setCenterY(300);
        ci.setRadius(80);
        ci.setFill(new ImagePattern(play));


            Group iroot= new Group(title);
            Group froot= new Group(root,c1.getRoot(),c.getRoot(),ci,title);
            Scene scene=new Scene(froot,600,600);
            scene.setFill(Color.BLACK);
            primaryStage.setTitle("Ellipse");
            primaryStage.setScene(scene);
            primaryStage.show();



        }


    public static void main(String[] args) {
        launch(args);
    }
}
