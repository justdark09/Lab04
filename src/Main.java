import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
        Lab04 - Line Art
        first update after cloning from vcs??
        Your goal is to generate a picture ONLY using straight lines. We will learn that we can still
        draw curves with straight lines. See the example below labeled 'Loop Paint example'.
 */

public class Main
{
    public static void main(String[] a)
    {
        JFrame app = new JFrame("Lab04 - Line Art");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.getContentPane().add(new Canvas());
        app.pack();
        app.setVisible(true);
        app.setLocationRelativeTo(null);
    }
}

class Canvas extends JPanel
{
    public Dimension getPreferredSize()
    {
        return new Dimension(1600, 900);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.darkGray);


        /*
            You will ONLY work below, unless you receive other instructions from Coach Martin

            Example for setting line color. 'g' is your graphics object that you will
            utilize to draw with. Notice the setColor method allows you to set the color of
            your line.

            The drawLine() method takes four inputs. Your start x, and y which is where your line
            will start from. Then the last two parameters are the x2 and y2 coordinates where you want to paint to.
        */
        g.setColor(Color.MAGENTA);
        // g.drawLine(10, 10, 300, 300);


        /*
            Loop Paint Example
            Notice our for loop has two control variables, and the iteration step modified both of them.
        */

        //grid lines
        // g.drawLine(800,0,800,900);
        // g.drawLine(0,450,1600,450);

        //BOTTOM
        //left side
        for (int y1 = 0, x2 = 0; y1 < 900; y1 += 15, x2 += 15)
        {
            g.drawLine(0, y1, x2, 900);
        }
        //right side
        for (int y1 = 0, x2 = 1600; y1 < 900; y1 += 15, x2 -= 15)
        {
            //x1 is 1599 because if it were 1600, there would be a small gap in
            //the top right of the "bottom" section of the lines
            g.drawLine(1599, y1, x2, 900);
        }

        //TOP
        //left side
        for (int y1 = 900, x2 = 0; y1 > 0; y1 -= 15, x2 += 15)
        {
            g.drawLine(0, y1, x2, 0);
        }
        //right side
        for (int y1 = 900, x2 = 1600; y1 > 0; y1 -= 15, x2 -= 15)
        {
            g.drawLine(1599,y1,x2,0);
        }
    }
}