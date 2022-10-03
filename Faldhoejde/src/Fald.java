import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Double g, t, v, h;
        String quit;
        Boolean loop;

        g = 9.80665;
        t = null;
        v = null;
        h = null;
        loop = true;


        while (true) {
            System.out.print("Angiv højde i cm: ");
            try {
                h = Double.parseDouble(scanner1.next());
                t = Math.sqrt((2 * h) / (g));
                v = g * t;
                System.out.println("Faldtiden uden luftmodstand er: " + String.format("%.2f", t) + " Sekunder");
                System.out.println("Sluthastighed uden luftmodstand: " + String.format("%.2f", v) + " m/s");
                System.out.println();
            }
            catch (NumberFormatException ignore)
            {
                System.out.println("Invalid input");
            }
        }
    }
}
