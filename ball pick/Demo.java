import java.util.Random;
public class Demo {
    public static void main(String[] args) {
        String[] balls = {"Red", "Blue", "Green", "Yellow", "Orange", "Purple"};
        Random random = new Random();
        int randomIndex = random.nextInt(balls.length);
        String pickedBall = balls[randomIndex]; 
        System.out.println("The picked ball is: " + pickedBall);
    }
}
