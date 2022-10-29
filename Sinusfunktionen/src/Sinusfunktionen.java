public class Sinusfunktionen {
    public static void main(String[] args) {
    test();
    test();
    }

    public static void test(){
        String star = ("*");
        String pipe = ("|");
        String spaces = (" ");

        String line1 = ((spaces.repeat(20)) + star + "\n");
        String line2 = ((spaces.repeat(20)) + pipe + spaces.repeat(6) + star + "\n");
        String line3 = ((spaces.repeat(20)) + pipe + spaces.repeat(13) + star + "\n");
        String line4 = ((spaces.repeat(20)) + pipe + spaces.repeat(17) + star + "\n");
        String line5 = ((spaces.repeat(20)) + pipe + spaces.repeat(19) + star + "\n");
        String line6 = ((spaces.repeat(20)) + pipe + spaces.repeat(17) + star + "\n");
        String line7 = ((spaces.repeat(20)) + pipe + spaces.repeat(13) + star + "\n");
        String line8 = ((spaces.repeat(20)) + pipe + spaces.repeat(6) + star + "\n");
        String line9 = ((spaces.repeat(20)) + star + "\n");
        String line10 = ((spaces.repeat(13))+ star + spaces.repeat(6) + pipe + "\n");
        String line11 = ((spaces.repeat(6))+ star + spaces.repeat(13) + pipe + "\n");
        String line12 = ((spaces.repeat(2))+ star + spaces.repeat(17) + pipe + "\n");
        String line13 = (star + spaces.repeat(19) + pipe + "\n");
        String line14 = ((spaces.repeat(2))+ star + spaces.repeat(17) + pipe + "\n");
        String line15 = ((spaces.repeat(6))+ star + spaces.repeat(13) + pipe + "\n");
        String line16 = ((spaces.repeat(13))+ star + spaces.repeat(6) + pipe + "\n");


        String drawingFinal = (line1 + line2 + line3 + line4 + line5 + line6 + line7 + line8 + line9 + line10 + line11 + line12 + line13 + line14 + line15 + line16);


        System.out.print(drawingFinal);
    }
}
