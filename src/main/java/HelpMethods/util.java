package HelpMethods;

import Model.*;

import java.util.Random;

public class util {
    public static Ball createRandomBall(){
        Random random = new Random();
        int i = random.nextInt(5);
        Ball ball = null;
        switch (i){
            case 0:
                ball = new YellowBall(random.nextInt(9),random.nextInt(9));
                break;
            case 1:
                ball = new BlueBall(random.nextInt(9),random.nextInt(9));
                break;
            case 2:
                ball = new RedBall(random.nextInt(9),random.nextInt(9));
                break;
            case 3:
                ball = new PurpleBall(random.nextInt(9),random.nextInt(9));
                break;
            case 4:
                ball = new GreenBall(random.nextInt(9),random.nextInt(9));
                break;
        }
        return ball;
    }
}
