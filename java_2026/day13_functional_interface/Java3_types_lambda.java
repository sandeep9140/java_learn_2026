interface B{
    //void show(int a);
    //void show(int a, int b);
    int add(int a, int b);
}

public class Java3_types_lambda {
    public static void main(String[] args) {
        /*
                parameterize lambda  single parameter 
        =======================================
        B obj1=(x)->{
            System.out.println(x);
        };
        obj1.show(10);
         */


        


        
    /*                2 parameters
        =============================
        B obj=(a,b)->{
            System.out.println(a+b);
        };

        obj.show(10, 20);

         */


        /*
                ==================================
                =========== return value =========
                ==================================

        */

        // B obj=(a,b)->{
        //     return a+b;
        // };

        //    short way of this 
        B obj=(a,b)->(a+b);

        int a=obj.add(20,30);
        System.out.println(a);

    }

    
}
