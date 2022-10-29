import java.util.Scanner;

public class Sinusfunktionen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nSinus = scanner.nextInt();
        test(nSinus);


    }

    public static void test(int nSinus){
        String star = ("*");
        String pipe = ("|");
        String spaces = (" ");


        String line1 = (nSpaces(20) + star + "\n");
        String line2 = (nSpaces(20) + pipe + nSpaces(6)  + star + "\n");
        String line3 = (nSpaces(20)  + pipe + nSpaces(13) + star + "\n");
        String line4 = (nSpaces(20)  + pipe + nSpaces(17) + star + "\n");
        String line5 = (nSpaces(20)  + pipe + nSpaces(19) + star + "\n");
        String line6 = (nSpaces(20)  + pipe + nSpaces(17) + star + "\n");
        String line7 = (nSpaces(20)  + pipe + nSpaces(13) + star + "\n");
        String line8 = (nSpaces(20)  + pipe + nSpaces(6) + star + "\n");
        String line9 = (nSpaces(20)  + star + "\n");
        String line10 = (nSpaces(13) + star + nSpaces(6) + pipe + "\n");
        String line11 = (nSpaces(6) + star + nSpaces(13) + pipe + "\n");
        String line12 = (nSpaces(2) + star + nSpaces(17) + pipe + "\n");
        String line13 = (star + nSpaces(19)  + pipe + "\n");
        String line14 = (nSpaces(2) + star + nSpaces(17) + pipe + "\n");
        String line15 = (nSpaces(6) + star + nSpaces(13) + pipe + "\n");
        String line16 = (nSpaces(13) + star + nSpaces(6) + pipe + "\n");


        String drawingFinal = (line1 + line2 + line3 + line4 + line5 + line6 + line7 + line8 + line9 + line10 + line11 + line12 + line13 + line14 + line15 + line16);

        for (int i = 1; i <= nSinus; i++){
            System.out.print(drawingFinal);
        }
    }

    public static String nSpaces(int n){
        String Antalspaces = "";
        for (int i = 1; i <= n; i++){
            Antalspaces += " ";
        }
        return Antalspaces;
    }
}
