import java.util.Random;

public class Colors implements Runnable {
    String[] col = { "white", "blue", "black", "green", "red", "yellow" };
    public Random random = new Random();

    public void run() {
        while (true) {
            int index = random.nextInt(col.length);
            String colo = col[index];
            System.out.println(colo);
            if (colo.equals("red")) {
                System.out.println("Red detected");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Colors color = new Colors();
        Thread th = new Thread(color);
        th.start();
    }
}
