package sample;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class Rhombus extends Application {

private double speed;
private double x_center;
private double y_center;
private double length;
private double width;
private Group root;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setY_center(double y_center) {
        this.y_center = y_center;
    }

    public void setX_center(double x_center) {
        this.x_center = x_center;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Group getRoot(){
        return root;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getX_center() {
        return x_center;
    }

    public double getY_center() {
        return y_center;
    }

    @Override
    public void start(Stage stage) throws Exception {

        Line l1 = new Line();
        l1.setStroke(Color.AQUAMARINE);
        l1.setStrokeWidth(width);
        l1.setStartX(x_center);
        l1.setStartY(y_center);
        l1.setEndX(x_center);
        l1.setEndY(y_center+length);
        l1.setRotate(0);
        l1.setStrokeLineCap(StrokeLineCap.ROUND);


        Line l3 = new Line();
        l3.setStroke(Color.YELLOW);
        l3.setStrokeWidth(width);
        l3.setStartX(x_center);
        l3.setStartY(y_center);
        l3.setEndX(x_center+length);
        l3.setEndY(y_center);
        l3.setRotate(0);
        l3.setStrokeLineCap(StrokeLineCap.ROUND);

        Line l2 = new Line();
        l2.setStroke(Color.MAGENTA);
        l2.setStrokeWidth(width);
        l2.setStartX(l1.getEndX());
        l2.setStartY(l1.getEndY());
        l2.setEndX(l1.getEndX()+length);
        l2.setEndY(l1.getEndY());
        l2.setRotate(0);
        l2.setStrokeLineCap(StrokeLineCap.ROUND);

        Line l4= new Line();
        l4.setStroke(Color.PURPLE);
        l4.setStrokeWidth(width);
        l4.setStartX(l3.getEndX());
        l4.setStartY(l3.getStartY());
        l4.setEndX(l2.getEndX());
        l4.setEndY(l2.getEndY());
        l4.setRotate(0);
        l4.setStrokeLineCap(StrokeLineCap.ROUND);


        root = new Group(l1,l3,l2,l4);
        RotateTransition rotate1 = new RotateTransition();
        rotate1.setAxis(Rotate.Z_AXIS);
        rotate1.setByAngle(360);
        rotate1.setCycleCount(Animation.INDEFINITE);
        rotate1.setDuration(Duration.INDEFINITE);
        rotate1.setAutoReverse(false);
        rotate1.setInterpolator(Interpolator.LINEAR);
        rotate1.setNode(root);

        rotate1.setRate(speed);
        rotate1.play();

    }


}
