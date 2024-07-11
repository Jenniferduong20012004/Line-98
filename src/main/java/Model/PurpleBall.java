package Model;

import Model.Ball;
import javafx.scene.paint.Color;

public class PurpleBall extends Ball {
    public PurpleBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.VIOLET;
    }
}
