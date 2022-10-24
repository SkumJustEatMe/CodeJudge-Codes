import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        int k = 0;
        int z = 1;

        Scanner scanner1 = new Scanner(System.in);
        int rows = scanner1.nextInt();

        for (int i = 1; i<= rows; ++i){
            System.out.println("\nPyramide " + i);
            pyramide(z, k, rows);
            ++z;
        }

        }

        private static void pyramide(int z, int k, int rows){
            for (int i = 1; i <= z; ++i, k = 0) {
                punktummer(rows, i);
                stjerner(k, i);
                punktummer(rows, i);

                System.out.println();
            }
        }

        private static void punktummer(int rows, int i){
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(".");
            }
        }

        private static void stjerner(int k, int i){
            while (k != 2 * i - 1) {
                System.out.print("#");
                ++k;
            }
        }

    }