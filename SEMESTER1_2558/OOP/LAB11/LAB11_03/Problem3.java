import javax.imageio.IIOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;

/**
 * Created by Administrator on 6/11/2558.
 */
public class Problem3 {

    public static void main (String[] args)throws IOException {

        // Choose file from directory
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Text File", "txt");
        jFileChooser.setFileFilter(fileNameExtensionFilter);

        PaintBoxes paintBoxes = new PaintBoxes();

        int returnVal = jFileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String getPath = jFileChooser.getSelectedFile().getPath();
            paintBoxes.readFile(getPath);

            JFrame jFrame = new JFrame();
            jFrame.setTitle("OOP LAB11");
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setBounds(100, 100, 500, 500);
            jFrame.getContentPane().add(paintBoxes);
            jFrame.setVisible(true);

        }
    }
}
