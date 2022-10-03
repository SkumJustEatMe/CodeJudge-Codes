import java.util.Scanner;

public class Fald {
    public static void main(String[] args) {
        Double g, t, v, h;
        String quit;
        Boolean loop;

        g = 9.80665;
        t = null;
        v = null;
        h = null;
        loop = true;



        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while (loop = true) {
            System.out.print("Indtast højde i cm: ");
            if (scanner1.hasNextDouble()) {
                h = scanner1.nextDouble();
                t = Math.sqrt((2 * h) / (g));
                v = g * t;
                System.out.println("Faldtiden uden luftmodstand er: " + t + " Sekunder");
                System.out.println("Sluthastighed uden luftmodstand: " + v + " m/s");

                System.out.print("Vil du afslutte y/n: ");
                quit = scanner2.nextLine();
                if (quit.equals("y")) {
                    break;
                }
            }
            else { System.out.print("Invalid input!"); break;}
        }
    }
}
