import java.time.LocalTime;

public class Java2_Local_time {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.getHour());
        System.out.println(lt.getSecond());
        

        LocalTime lt1=LocalTime.of(06,12);
        System.out.println(lt1);

        
        System.out.println(lt);

        

    }


    
}
