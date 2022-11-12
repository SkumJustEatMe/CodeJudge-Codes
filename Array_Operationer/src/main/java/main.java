public class main {
    public static void main(String[] args) {
        int[] a = {1,3,3,2,1};
        System.out.println("As string: " + ArrayUtils.arrayToString(a));
        System.out.println("Occurences: " + ArrayUtils.occurences(a, 3));
        System.out.println("Sum: " + ArrayUtils.sum(a));
    }
}
