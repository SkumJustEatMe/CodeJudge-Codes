import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();

        Histogram histogram = new Histogram();
        histogram.convertStringToList(input);
        System.out.print(histogram.tabel());

    }
}
