enum Day{
    TODAY,
    TOMMAROW,
    YESTERDAY
}
public class Java4_Enum {
    public static void main(String[] args) {
        Day day=Day.TODAY;
        //Day day=Day.MERADAY;
        //THAT OBJECT ARE OLNY ACCES THAT DAT WHICH ARE DEFINE IN ENUM 

        System.out.println(day);
    }
    
}
