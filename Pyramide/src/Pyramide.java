import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        int k = 0;
        int z = 1;

        Scanner scanner1 = new Scanner(System.in);
        int rows = scanner1.nextInt();

        for (int i = 1; i<= rows; ++i){
            System.out.println("\nPyramid " + i);
            pyramide(z, k);
            ++z;
        }

        }

        private static void pyramide(int z, int k){
            for (int i = 1; i <= z; ++i, k = 0) {
                punktummer(i, z);
                stjerner(k, i);
                punktummer(i, z);

                System.out.println();
            }
        }

        private static void punktummer(int i, int z){
            for (int space = 1; space <= z - i; ++space) {
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