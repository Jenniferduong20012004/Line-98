package Model;

import javafx.scene.paint.Color;

public class BrownBall extends Ball{
    public BrownBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.BISQUE;
    }
}
