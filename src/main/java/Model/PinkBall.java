package Model;

import javafx.scene.paint.Color;

public class PinkBall extends Ball{
    public PinkBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.PINK;
    }
}
