import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int input = scanner1.nextInt();
        int f1, f2, f3;
        f1 = 1;
        f2 = 1;

        int[] tal = new int[input];
        tal[0] = f1;
        tal[1] = f2;

        for (int i = 0; i < input; i++){
            f3 = f1+f2;
            tal[i+2] = f3;
            f1 = f2;
            f2 = f3;
        }



    }
}
