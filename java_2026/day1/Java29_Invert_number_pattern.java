public class Java29_Invert_number_pattern {
       /*
       1 
       22
       333
       4444


       1234
       123
       12
       1
    */
   public static void main(String[] args) {
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }



    for(int i=1;i<=4;i++){
        for(int j=1;j<=4-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   }
    
}
