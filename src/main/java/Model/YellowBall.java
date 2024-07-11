package Model;

import Model.Ball;
import javafx.scene.paint.Color;

public class YellowBall extends Ball {

    public YellowBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }
}
