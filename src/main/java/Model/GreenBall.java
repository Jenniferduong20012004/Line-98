package Model;

import Model.Ball;
import javafx.scene.paint.Color;

public class GreenBall extends Ball {
    public GreenBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
