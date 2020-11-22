package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Test extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        try {
            BorderPane root = new BorderPane();
            root.setPadding(new Insets(10));
            Scene scene = new Scene(root,400,400);
            Label l = new Label("SHAPE IMAGE OF MY SISTER");
            l.setFont(Font.font(Font.getFontNames().get(23), FontWeight.EXTRA_BOLD, 14));
            l.setAlignment(Pos.CENTER);
            l.setPrefWidth(Double.MAX_VALUE);
            root.setTop(l);
            Circle cir2 = new Circle(250,250,120);
            Image im = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjz5OqxV1HCH_2XcI9DekM4W1269804OAF8Q&usqp=CAU",false);
            cir2.setFill(new ImagePattern(im));
            root.setCenter(cir2);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }




    public static void main(String[] args) {
        launch(args);
    }


}
