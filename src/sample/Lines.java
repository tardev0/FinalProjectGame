package sample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

class Lines extends Application{

    private double x_axis=100.0, y_axis=100.0,x_copy=0;
    private double width=15;
    private double speed;
    private Group root;

    public Group getRoot() {
        return root;
    }

    @Override
    public void start(Stage stage) {
        //Creating a line object
        Line bline = new Line();

        //Setting the properties to a line
        bline.setStartX(x_axis);
        bline.setStartY(y_axis);
        x_copy=x_axis+50;
        bline.setEndX(x_copy);
        bline.setEndY(y_axis);
        bline.setStrokeWidth(15);
        bline.setStroke(Color.BLUE);

        Line yline = new Line();

//Setting the properties to a line
        yline.setStartX(x_copy+width);
        x_copy=x_copy+width+50;
        yline.setStartY(y_axis);
        yline.setEndX(x_copy);
        yline.setEndY(y_axis);
        yline.setStrokeWidth(15);
        yline.setStroke(Color.YELLOW);

        Line pline = new Line();

//Setting the properties to a line
        pline.setStartX(x_copy+width);
        x_copy=x_copy+width+50;
        pline.setStartY(y_axis);
        pline.setEndX(x_copy);
        pline.setEndY(y_axis);
        pline.setStrokeWidth(15);
        pline.setStroke(Color.PURPLE);

        Line rline = new Line();

//Setting the properties to a line
        rline.setStartX(x_copy+width);
        x_copy=x_copy+width+50;
        rline.setStartY(y_axis);
        rline.setEndX(x_copy);
        rline.setEndY(y_axis);
        rline.setStrokeWidth(15);
        rline.setStroke(Color.MEDIUMVIOLETRED);


        //Creating a Group
        root = new Group(bline,yline,pline,rline);
    }
    public static void main(String args[]){
        launch(args);
    }
}