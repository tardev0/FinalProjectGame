package sample;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

class Main extends Application{

    private double x_axis, y_axis,x_copy,y_copy;
    private Group root;

    private double speed;

    public void setRotateSpeed(double speed) {
        this.speed = speed;
    }

    public double getRotateSpeed() {
        return speed;
    }


    public double getX_axis() {
        return x_axis;
    }

    public double getY_axis() {
        return y_axis;
    }

    public void setX_axis(double x_axis) {
        this.x_axis = x_axis;
    }

    public void setY_axis(double y_axis) {
        this.y_axis = y_axis;
    }

    @Override
    public void start(Stage stage) {
        //Creating a line object
        Line bline = new Line();

        //Setting the properties to a line
        bline.setStartX(x_axis);
        bline.setStartY(y_axis);
        bline.setEndX(x_axis);
        bline.setEndY(y_axis+150);
        x_copy=x_axis+50;
        y_copy=y_axis+150;
        bline.setStrokeWidth(15);
        bline.setStroke(Color.BLUE);

        Line yline = new Line();

//Setting the properties to a line
        yline.setStartX(x_copy);
        yline.setStartY(y_axis+25);
        yline.setEndX(x_copy);
        yline.setEndY(y_copy-25);
        x_copy=x_copy+50;
        yline.setStrokeWidth(15);
        yline.setStroke(Color.YELLOW);

        Line pline = new Line();

//Setting the properties to a line
        pline.setStartX(x_copy);
        pline.setStartY(y_axis);
        pline.setEndX(x_copy);
        pline.setEndY(y_copy);
        x_copy=x_copy+50;
        pline.setStrokeWidth(15);
        pline.setStroke(Color.PURPLE);

        Line rline = new Line();

//Setting the properties to a line
        rline.setStartX(x_copy);
        rline.setStartY(y_axis+25);
        rline.setEndX(x_copy);
        rline.setEndY(y_copy-25);
        rline.setStrokeWidth(10);
        rline.setStroke(Color.MEDIUMVIOLETRED);


        //Creating a Group
        root = new Group(bline,yline,pline,rline);

    }
    public static void main(String args[]){
        launch(args);
    }
}