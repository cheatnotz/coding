import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem2 extends JFrame{
    private JPanel contentPanel;

    public Problem2() {
        // Frame setting
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,400);
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.white);
    }

    public void paint(Graphics g) {
        // Drawing 1st blue box
        g.setColor(Color.blue);
        g.fillRect(50,300,50,50);

        // Drawing 2nd blue box
        g.setColor(Color.blue);
        g.fillRect(100,250,50,100);

        // Drawing 3rd blue box
        g.setColor(Color.blue);
        g.fillRect(150,200,50,150);

        // Drawing 4th blue box
        g.setColor(Color.blue);
        g.fillRect(200,150,50,200);

        // Drawing 5th blue box
        g.setColor(Color.blue);
        g.fillRect(250,100,50,250);
    }

    public static void main(String[] args) {
        Problem2 frame = new Problem2();
        frame.setVisible(true);
    }
}
