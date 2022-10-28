import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoekkerOgStrenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();

        String extractInt = stringInput.replaceAll("[^0-9]", "");
        String extractString = stringInput.replaceAll("[0-9]", "");
        int convertToInt = Integer.parseInt(extractInt);
        char[] convertToChar = extractString.toCharArray();



        for (int i = 0; i < extractString.length(); i++){
            for (int j = 0; j < convertToInt; ++j){
                System.out.print(convertToChar[i]);
            }
        }
    }
}