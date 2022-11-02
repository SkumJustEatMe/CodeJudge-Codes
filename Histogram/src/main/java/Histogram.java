import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();

        Histogram histogram = new Histogram();
        histogram.convertStringToList(input);
        System.out.print(histogram.tabel());

    }

    private String[] array = null;
    private String count = "*";

    public Histogram(){
    }

    public String[] convertStringToList(String input){
        this.array = input.split(" ");
        return this.array;
    }

    public String printString(){
        return this.array[3];
        }

    public String tabel() {
        int en =0, to = 0, tre=0, fire=0, fem=0, seks=0, syv=0, otte=0, ni=0, ti=0;
        for (int i = 0; i < array.length; i++) {
            int variable = Integer.parseInt(array[i]);

            if (variable > 0 && variable < 11) {
               en += 1;
            } else if (variable>10 && variable <21) {
                to += 1;
            }else if (variable>20 && variable <31) {
                tre += 1;
            }else if (variable>30 && variable <41) {
                fire += 1;
            }else if (variable>40 && variable <51) {
                fem += 1;
            }else if (variable>50 && variable <61) {
                seks += 1;
            }else if (variable>60 && variable <71) {
                syv += 1;
            }else if (variable>70 && variable <81) {
                otte += 1;
            }else if (variable>80 && variable <91) {
                ni += 1;
            }else if (variable>90 && variable <101) {
                ti += 1;
            }else if (variable>100 && variable <0) {
                System.out.println("Udenfor rækkedvidde");
            }
        }

        String line1 = "1 - 10   | " + nStars(en) + "\n";
        String line2 = "11 - 20  | " + nStars(to) + "\n";
        String line3 = "21 - 30  | " + nStars(tre) + "\n";
        String line4 = "31 - 40  | " + nStars(fire) + "\n";
        String line5 = "41 - 50  | " + nStars(fem) + "\n";
        String line6 = "51 - 60  | " + nStars(seks) + "\n";
        String line7 = "61 - 70  | " + nStars(syv) + "\n";
        String line8 = "71 - 80  | " + nStars(otte) + "\n";
        String line9 = "81 - 90  | " + nStars(ni) + "\n";
        String line10 = "91 - 100 | " + nStars(ti) + "\n";

        String tabel = line1 + line2 + line3 + line4 + line5 + line6 + line7 + line8 + line9 + line10;

        return tabel;
    }

    public static String nStars(int n){
        String antalStars = "";
        for (int i = 1; i <= n; i++){
            antalStars += "*";
        }
        return antalStars;
    }
}
