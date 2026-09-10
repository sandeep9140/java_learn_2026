
import java.io.BufferedWriter;

import java.io.FileWriter;

public class Java5_bufferedWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data2.txt");

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello sandeep how are u");
            bw.write("hello sandeep how are u");bw.newLine();bw.write("hello sandeep how are u");bw.write("hello sandeep how are u");bw.write("hello sandeep how are u");bw.write("hello sandeep how are u");
            
            bw.close();
            fw.close();

        } catch (Exception e) {
        }
    }

}
