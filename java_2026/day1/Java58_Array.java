public class Java58_Array {
    public static void main(String[] args) {
        
    

    int[] arr1={10,20,30,40,50};
    
    int[] arr2;
    arr2= new int[5];
    arr2[0]=22;
    arr2[1]=33;
    
    // int[] arr3;
    // arr3={10,30,40};// not alloew

     int[] arr3;
     arr3=new int[]{10,30,40};
    System.out.println(arr3[1]);
    System.out.println(arr3.length);


        int arr4[]={10,30,40,49};
        System.out.println(arr4[3]);
    }
}
