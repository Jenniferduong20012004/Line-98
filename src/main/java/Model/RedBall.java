package Model;

import Model.Ball;
import javafx.scene.paint.Color;

public class RedBall extends Ball {
    public RedBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
