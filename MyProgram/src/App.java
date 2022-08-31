import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       
        Random r = new Random();
        int num = r .nextInt(6);
        System.out.println("You rolled a : " + num + " !");
    }
}
