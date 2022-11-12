import java.util.Scanner;

public class Badevand {
    public static void main(String[] args) {

        int[] values = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            values[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Maksimum: " + maks(values));

        System.out.print("Antal fald: " + antalfald(values));
    }

    public static int maks(int[] badetemp){
        int n = badetemp[0];
        for (int i = 1; i < badetemp.length; i++){
            if (badetemp[i] > n)
                n = badetemp[i];
        }
        return n;
    }

    public static int antalfald(int[] badetemp){
        int fald = 0;
        int j = 0;
        for (int i = 0; i < badetemp.length; i++){
            j += 1;
            if (badetemp.length != j && badetemp[i] > badetemp[j]){
                fald += 1;
            }
        }
        return fald;
    }

}
