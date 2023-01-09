import java.util.Random;

public class RandomStudy {

    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Random number: " + rnd.nextInt(0, 10));
        }
    }
    
}
