import java.io.FileOutputStream;

public class Java7_OutputStream {

    public static void main(String[] args) {

        try {
            FileOutputStream os = new FileOutputStream("data3.txt");

            os.write(65);

            os.close();

        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}