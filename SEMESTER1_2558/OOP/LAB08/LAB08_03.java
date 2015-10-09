import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Problem3 extends JFrame{
    private JPanel contentPanel;

    public Problem3() {
        // Frame setting
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,500);
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.white);
    }

    public void paint(Graphics g) {
        // Create flexible x,y axis
        int x_axis = 0;
        int y_axis = 50;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 4; j++) {
                Random rnd = new Random();
                int red = rnd.nextInt(255);
                int green = rnd.nextInt(255);
                int blue = rnd.nextInt(255);
                Color newColor = new Color(red, green, blue);
                if(i % 2 == 0) {
                    g.setColor(newColor);
                    g.fillRect(x_axis, y_axis, 50, 50);
                }
                else {
                    g.setColor(newColor);
                    g.fillRect(x_axis + 50, y_axis, 50, 50);
                }
                x_axis += 100;
            }
            x_axis = 0;
            y_axis += 50;
        }
    }

    public static void main(String[] args) {
        Problem3 frame = new Problem3();
        frame.setVisible(true);
    }
}
