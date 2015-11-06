/*import java.io.*;

public class Problem2 {

    public static void main (String[] args) throws IOException{

        File file = new File("ping.bin");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        InputStream inputStream = new FileInputStream("C:/Users/Administrator/Desktop/LAB11/ping.bin");
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        System.out.println(dataInputStream.readFully());

        bufferedReader.close();

    }
}*/

import java.awt.Point;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;


public class Problem2 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File inFile = new File("ping.bin");
        FileReader fileReader = new FileReader(inFile); //open stream for reading from th
        BufferedReader bufReader = new BufferedReader(fileReader); //for reading as a line
        InputStream i= new FileInputStream("C:/Users/Administrator/Desktop/LAB11/ping.bin");
        DataInputStream data = new DataInputStream(i);

        System.out.println("Type = " + data.readByte());
        System.out.println("Code = " + data.readByte());
        String bytethree =String.format("%x", data.readByte());
        String bytefour =String.format("%x", data.readByte());
        System.out.println("Chacksum = "+ bytethree+bytefour);
        for(int ii=0;ii<13;ii++){
            data.readByte();
        }
        System.out.print("Data = ");
        for(int ii=0;ii<31;ii++){
            String bytefou =String.format("%x", data.readByte());
            System.out.print(bytefou);
        }




        bufReader.close(); //close the stream
    }

}
