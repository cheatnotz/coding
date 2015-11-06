import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 6/11/2558.
 */
public class Problem1 {

    public static void main(String[] args) throws IOException{
        // Variables
        String text, line;
        Scanner scanner;

        // File procession
        File file = new File("output.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 1; i <= 5; i++) {
            // Stream input
            scanner = new Scanner(System.in);
            System.out.print(String.format("Line %d: ", i));
            text = scanner.next();

            bufferedWriter.write(text.toUpperCase());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
