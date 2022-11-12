import java.util.Arrays;

public class ArrayUtils {

    public static String arrayToString(int [] a){
        String numbers = Arrays.toString(a);
        numbers = numbers.replaceAll("[,]", "");
        numbers = numbers.replace("[","{");
        numbers = numbers.replace("]","}");
        return numbers;
        }

    public static int occurences(int [] a, int n){
        int j = 0;
        for (int i = 0; i < a.length; i++){
            if ( n == a[i]){
                j += 1;
            }
        }
        return j;
    }

    public static int sum(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
