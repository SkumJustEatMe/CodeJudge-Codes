public class Middelvaerdi {
    public static void main(String[] args) {
        String tal = "1 1 1 2 3 1 4 5 6 7 8 9 4 5 1 2 22 44 55 66 88 99 55 11 22 100";
        Middelvaerdi middelvaerdi = new Middelvaerdi(tal);
        System.out.println("Mean: " + middelvaerdi.mean());
        System.out.print("Standard deviation: " + middelvaerdi.deviation());
    }

    private String[] array = null;
    private double mean;
    private double spredning;

    public Middelvaerdi(String input){
        this.array = input.split(" ");
    }

    public double mean() {
        for (int i = 0; i < array.length; i++) {
            double variable = Integer.parseInt(array[i]);
            mean += variable;
        }
        return mean/array.length;
    }

    public double deviation(){
        for (int i = 0; i < array.length; i++) {
            double variable = Integer.parseInt(array[i]);
            spredning += Math.pow(variable - mean/array.length, 2);
        }
        return Math.sqrt(spredning)/array.length;
    }


}
