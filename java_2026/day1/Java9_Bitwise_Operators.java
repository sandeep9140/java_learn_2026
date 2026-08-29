public class Java9_Bitwise_Operators {
    public static void main(String[] args) {
        // &(bitwise AND) |(bitwise OR) ^(bitwise XOR) ~(Bitwise NOT)
        int a=5;
        int b=3;
        //&
        System.out.println(a & b);//0101  0011 => 0001
        //  |
        System.out.println(a | b);//0101  0011 => 0111

        
        //  ^ 
        System.out.println(a ^ b);//0101  0011 => 0110

        //  ~
        System.out.println(~b);//0011=>3  -(3+1)


        
    }
    
}
