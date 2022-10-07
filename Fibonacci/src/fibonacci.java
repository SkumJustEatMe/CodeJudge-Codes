import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int input = scanner1.nextInt();
        int f1, f2, f3;
        f1 = 0;
        f2 = 1;

        for (int i = 0; i < input; i++){
            System.out.println(f2);
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }



    }
}
