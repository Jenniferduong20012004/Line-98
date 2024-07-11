package Model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public abstract class Ball {
    private int x;
    private int y;
    private Circle circle;
    public Ball(int x, int y){
        this.x = x;
        this.y =y;
        circle = new Circle(640,140,100);
        circle.setFill(getColor());
    }

    public abstract Color getColor();
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
