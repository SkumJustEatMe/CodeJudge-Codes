import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Drawing extends JTextComponent {

    private int width;
    private int hight;

    public Drawing(int w, int h){
        width = w;
        hight = h;
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D r = new Rectangle2D.Double(0,0,width,hight);
        g2d.setColor(new Color(255,255,255));
        g2d.fill(r);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(200,75,100,100);
        g2d.setColor(Color.BLACK);
        g2d.fill(ellipse);

        Line2D.Double line = new Line2D.Double(200, 75, 250, 250);
        g2d.setColor(Color.BLUE);
        g2d.draw(line);
    }
}
