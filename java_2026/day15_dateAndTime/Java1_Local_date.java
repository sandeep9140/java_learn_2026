import java.time.LocalDate;

class Java1_Local_date{
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfWeek());

        System.out.println(ld.plusDays(10));// return only not modified
        LocalDate lpda=ld.plusDays(20);
        System.out.println(ld);
        System.out.println(lpda);

        LocalDate ld1=LocalDate.of(2026, 4, 3);
        System.out.println(ld1);
        
    }
    
    
}