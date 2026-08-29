public class Java62_jagged_array {
    public static void main(String[] args) {
        int[][]  arr=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[3];

        System.out.println("rows length = "+ arr.length);
        System.out.println("row0 length = "+ arr[0].length);
        System.out.println("row1 length = "+ arr[1].length);
        System.out.println("row2 length = "+ arr[2].length);
    }
}
