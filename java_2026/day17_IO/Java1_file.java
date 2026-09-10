import java.io.File;
import java.io.IOException;

public class Java1_file {
    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");

        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        file.createNewFile();
        file.delete();

        if(!file.exists()){
            file.createNewFile();
            System.out.println("created file....");
        }
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());


    }
    
}
