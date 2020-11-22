package sample;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Circles extends Application {
    private Group root = new Group();
    private double x_center, y_center;
    private double radius;
    private double speed;
    private double angle;

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void setRotateSpeed(double speed) {
        this.speed = speed;
    }

    public double getRotateSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public double getX_center() {
        return x_center;
    }

    public double getY_center() {
        return y_center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX_center(double x_center) {
        this.x_center = x_center;
    }

    public void setY_center(double y_center) {
        this.y_center = y_center;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle();


        Arc arc1 = new Arc();
        arc1.setCenterX(x_center);
        arc1.setCenterY(y_center);
        arc1.setRadiusX(radius);
        arc1.setRadiusY(radius);
        arc1.setStartAngle(45);
        arc1.setLength(90.37167f);
        arc1.setType(ArcType.OPEN);
        arc1.setFill(null);
        arc1.setStroke(Color.AQUAMARINE);
        arc1.setStrokeWidth(15);



        Arc arc2 = new Arc();
        arc2.setCenterX(x_center);
        arc2.setCenterY(y_center);
        arc2.setRadiusX(radius);
        arc2.setRadiusY(radius);
        arc2.setStartAngle(135);
        arc2.setLength(90.37167f);
        arc2.setType(ArcType.OPEN);
        arc2.setFill(null);
        arc2.setStroke(Color.MAGENTA);
        arc2.setStrokeWidth(15);


        Arc arc3 = new Arc();
        arc3.setCenterX(x_center);
        arc3.setCenterY(y_center);
        arc3.setRadiusX(radius);
        arc3.setRadiusY(radius);
        arc3.setStartAngle(315);
        arc3.setLength(90.37167f);
        arc3.setType(ArcType.OPEN);
        arc3.setFill(null);
        arc3.setStroke(Color.YELLOW);
        arc3.setStrokeWidth(15);

        Arc arc4 = new Arc();
        arc4.setCenterX(x_center);
        arc4.setCenterY(y_center);
        arc4.setRadiusX(radius);
        arc4.setRadiusY(radius);
        arc4.setStartAngle(225);
        arc4.setLength(90.37167f);
        arc4.setType(ArcType.OPEN);
        arc4.setFill(null);
        arc4.setStroke(Color.PURPLE);
        arc4.setStrokeWidth(15);



        root = new Group(arc1,arc2,arc3,arc4);
        RotateTransition rotate1 = new RotateTransition();
        rotate1.setAxis(Rotate.Z_AXIS);
        rotate1.setByAngle(angle);
        rotate1.setCycleCount(Animation.INDEFINITE);
        rotate1.setDuration(Duration.INDEFINITE);
        rotate1.setAutoReverse(false);
        rotate1.setInterpolator(Interpolator.LINEAR);
        rotate1.setNode(root);
        rotate1.setRate(speed);
        rotate1.play();

    }

    public Group getRoot() {
        return root;
    }


}
