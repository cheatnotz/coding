import javax.imageio.IIOException;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Administrator on 6/11/2558.
 */
public class PaintBoxes extends Canvas {
    ArrayList<Integer> x = new ArrayList();
    ArrayList<Integer> y = new ArrayList();

    public void readFile(String fileName) throws IOException{
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String line = bufferedReader.readLine(); // Read each line
            if (line != null) {
                String[] text = line.split(" ");
                Point point = new Point();
                point.x = Integer.parseInt(text[0]);
                point.y = Integer.parseInt(text[1]);

                x.add(point.x);
                y.add(point.y);
            }
            else{
                break;
            }
        }
    }


    public void paint(Graphics graphics) {
        for(int axis = 0; axis < x.size(); axis++) {
            graphics.setColor(Color.BLUE);
            graphics.fillRect(x.get(axis), y.get(axis), 50, 50);
        }
    }

}
