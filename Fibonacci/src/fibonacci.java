public class fibonacci {
    public static void main(String[] args) {
        int input = 12;
        double golden;
        golden = 1.618;
        int count = 0;

        int f1, f2;
        f1 = 0;
        f2 = 1;

        int[] tal = {0,1};

        for (int i = 0; i < input; i++){
            int NytTal = tal[f1]+tal[f2];
            f1++;
            f2++;
            System.out.println(NytTal);

        }



    }
}
