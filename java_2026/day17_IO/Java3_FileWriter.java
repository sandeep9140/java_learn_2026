import java.io.FileReader;
import java.io.FileWriter;

public class Java3_FileWriter {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("file.txt")){
            fw.write("Sandeep \n");
            fw.write("java");
            System.out.println("data inserted");
        }catch(Exception e){
            System.out.println("handle exception ----------");
        }
        System.out.println("reading data ------------");
        try(FileReader fr=new FileReader("file.txt")){
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
        }
        catch(Exception e){
            System.out.println("handles");
        }



    }

    
}