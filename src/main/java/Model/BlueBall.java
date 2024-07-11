package Model;

import Model.Ball;
import javafx.scene.paint.Color;

public class BlueBall extends Ball {

    public BlueBall(int x, int y) {
        super(x, y);
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
