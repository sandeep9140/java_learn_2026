public class Java1_Wrapper_classes {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Integer a1=a;
        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println(a1 instanceof Integer);
        System.out.println(a1.hashCode());
        System.out.println(a1.getClass());
        
        /*
        byte   =========>   Byte
        short ==========>   Short
        int   ==========>   Integer
        long  ==========>   Long
        float ==========> Float 
        double ===========> Double
        char  =============> Character
        boolean ============> Boolean
        */
        


        //    valueOf();

        //Integer c=100;
          //or 
        Integer c=Integer.valueOf(100);
    }
    
}
