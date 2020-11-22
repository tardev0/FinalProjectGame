package sample;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

class CrossObstacle{
        private Group root;
        private double x_center, y_center;
        private double speed;

        public Group getRoot() {
            return root;
        }

        public void setRotateSpeed(double speed) {
            this.speed = speed;
        }

        public double getRotateSpeed() {
            return speed;
        }

        public double getX_center() {
            return x_center;
        }

        public double getY_center() {
            return y_center;
        }

        public void setX_center(double x_center) {
            this.x_center = x_center;
        }

        public void setY_center(double y_center) {
            this.y_center = y_center;
        }


        public void start(Stage stage) {
            //Creating a line object
            Line bline = new Line();

            //Setting the properties to a line
            bline.setStartX(x_center);
            bline.setStartY(y_center);
            bline.setEndX(x_center+100);
            bline.setEndY(y_center);
            bline.setStrokeWidth(15);
            bline.setStroke(Color.BLUE);

            Line yline = new Line();

//Setting the properties to a line
            yline.setStartX(x_center);
            yline.setStartY(y_center);
            yline.setEndX(x_center);
            yline.setEndY(y_center-100);
            yline.setStrokeWidth(15);
            yline.setStroke(Color.YELLOW);

            Line pline = new Line();

//Setting the properties to a line
            pline.setStartX(x_center);
            pline.setStartY(y_center);
            pline.setEndX(x_center-100);
            pline.setEndY(y_center);
            pline.setStrokeWidth(15);
            pline.setStroke(Color.PURPLE);

            Line rline = new Line();

//Setting the properties to a line
            rline.setStartX(x_center);
            rline.setStartY(y_center);
            rline.setEndX(x_center);
            rline.setEndY(y_center+100);
            rline.setStrokeWidth(15);
            rline.setStroke(Color.MEDIUMVIOLETRED);


            //Creating a Group
            root = new Group(bline,yline,pline,rline);


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