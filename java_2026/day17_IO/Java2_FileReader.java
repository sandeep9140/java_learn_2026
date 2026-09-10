
import java.io.FileReader;
import java.io.IOException;

public class Java2_FileReader {
    public static void main(String[] args) {
        //File f=new File("file1.txt");

        try{
            FileReader fr=new FileReader("data1.txt");
            

                int ch;
                while((ch=fr.read())!=-1){
                System.out.print((char)ch);
                }

            
        }
        catch(Exception e){
            System.out.println("Exception caugh");
        }
        



        
    }

    
}