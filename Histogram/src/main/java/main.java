import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanner1 = scanner.nextLine();

        Histogram histogram = new Histogram();
        System.out.print(histogram.convertStringToList(scanner1));

    }
}
