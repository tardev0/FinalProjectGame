package sample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

class Main extends Application{
    @Override
    public void start(Stage stage) {
        //Creating a line object
        Line bline = new Line();

        //Setting the properties to a line
        bline.setStartX(100.0);
        bline.setStartY(150.0);
        bline.setEndX(100.0);
        bline.setEndY(500.0);
        bline.setStrokeWidth(10);
        bline.setStroke(Color.BLUE);

        Line yline = new Line();

//Setting the properties to a line
        yline.setStartX(200.0);
        yline.setStartY(200.0);
        yline.setEndX(200.0);
        yline.setEndY(400.0);
        yline.setStrokeWidth(10);
        yline.setStroke(Color.YELLOW);

        Line pline = new Line();

//Setting the properties to a line
        pline.setStartX(300.0);
        pline.setStartY(150.0);
        pline.setEndX(300.0);
        pline.setEndY(500.0);
        pline.setStrokeWidth(10);
        pline.setStroke(Color.PURPLE);

        Line rline = new Line();

//Setting the properties to a line
        rline.setStartX(400.0);
        rline.setStartY(200.0);
        rline.setEndX(400.0);
        rline.setEndY(400.0);
        rline.setStrokeWidth(10);
        rline.setStroke(Color.MEDIUMVIOLETRED);


        //Creating a Group
        Group root = new Group(bline,yline,pline,rline);

        //Creating a Scene
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the scene
        stage.setTitle("Sample application");

        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}