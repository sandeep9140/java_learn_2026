public class Java61_two_diamention_array {

    public static void main(String[] args) {
        // created array 2D
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(arr[2][1]);//8// access
        System.out.println(arr.length);


        // traverse array 

        for(int i=0; i < arr.length ;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
