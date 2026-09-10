import java.io.BufferedReader;
import java.io.FileReader;

public class Java4_bufferReader {
    public static void main(String[] args) {
        try{
        FileReader fr=new FileReader("file.txt");

        BufferedReader br=new BufferedReader(fr);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }


        

    }catch(Exception e){}
    }

}
