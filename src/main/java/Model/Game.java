package Model;

import HelpMethods.util;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static Game single_instance = null;
    private List<Ball> balls;
    private Game() {
        balls = new ArrayList<>();
        for (int i =0; i<9; i++){
            balls.add(util.createRandomBall());
        }
    }
    public static Game startGame(){
        if (single_instance==null){
            single_instance = new Game();
        }
        return  single_instance;
    }
}
