public class main {
    public static void main(String[] args) {
        Singleton single28 = Singleton.getInstance();

        single28.setString("Hej");
        System.out.println(single28.getString());

        Singleton single29 = Singleton.getInstance();

        single29.setString("Hej2");
        System.out.println(single29.getString());
        System.out.println(single28.getString());

    }
}
