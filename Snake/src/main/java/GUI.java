import javax.swing.*;
import java.awt.*;

public class GUI {

    private int w = 1080;
    private int h = 720;
    public GUI(){
        JFrame frame = new JFrame();
        Drawing rectangel = new Drawing(w, h);

        frame.setSize(w,h);
        frame.setTitle("Test");
        frame.add(rectangel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
