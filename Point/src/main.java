public class main {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);
        Point p2 = new Point(2,2);
        p1.move(2,5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

    }
}
