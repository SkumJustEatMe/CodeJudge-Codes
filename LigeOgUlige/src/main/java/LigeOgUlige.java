import java.util.Arrays;
import java.util.Scanner;

public class LigeOgUlige {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanner1 = scanner.nextLine();

        LigeOgUlige run = new LigeOgUlige();
        String lige = run.moveToLeft(run.makeArray(scanner1));
        System.out.print(lige);
    }

    private int[] array;
    private int j = 0;

    public LigeOgUlige(){
    }

    public int[] makeArray(String tal){
        String[] numbers = tal.replaceAll(" ", ",").split(",");
        int[] numbersArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            numbersArray[i] = Integer.parseInt(numbers[i]);
        }
        return numbersArray;
    }

    public int checkArray(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                this.j += 1;
            }
        }
        return this.j;
    }

    public String moveToLeft(int[] array){
        int d = array[array.length - 1];
        int[] newArray = Arrays.copyOf(array, array.length - 1);
        int n = newArray.length;

        if (d > 0) {
            if (d > newArray.length) {
                d = d - newArray.length;
            }

            while (d > n) {
                d = d - n;
            }

            int temp[] = new int[n - d];

            for (int i = 0; i < n - d; i++)
                temp[i] = newArray[i];

            for (int i = n - d; i < n; i++) {
                newArray[i - n + d] = newArray[i];
            }

            for (int i = 0; i < n - d; i++) {
                newArray[i + d] = temp[i];
            }

        }
        else {
            {
                d = Math.abs(-d);

                if (d > newArray.length) {
                    d = d % newArray.length;
                }

                int temp[] = new int[d];

                for (int i = 0; i < d; i++)
                    temp[i] = newArray[i];

                for (int i = d; i < n; i++) {
                    newArray[i - d] = newArray[i];
                }

                for (int i = 0; i < d; i++) {
                    newArray[i + n - d] = temp[i];
                }
            }
        }

        String makestring = Arrays.toString(newArray).replaceAll(", ", " ");
        makestring = makestring.replace("[", "");
        makestring = makestring.replace("]", "");

        return makestring;
        }
    }
