import java.time.Duration;
import java.time.LocalTime;

public class Java6_Duration {
    public static void main(String[] args) {
        LocalTime start=LocalTime.of(10,0, 0);
        LocalTime end=LocalTime.of(12,30, 0);
        
        Duration d=Duration.between(start, end);
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toSeconds());
        
    }
    
}
