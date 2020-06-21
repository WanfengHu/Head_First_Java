package Chapter14;

import java.io.*;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyTest.txt");
            BufferedReader reader = new BufferedReader(new FileReader(myFile));

            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex) {ex.printStackTrace();}
    }
}