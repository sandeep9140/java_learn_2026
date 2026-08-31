enum Bhai{
    Vijay,
    AJAY,
    RAJ
}
public class Java5_Enum_method {
    public static void main(String[] args) {
        for(Bhai name : Bhai.values()){
            System.out.println(name);
        }
    }
    
}
