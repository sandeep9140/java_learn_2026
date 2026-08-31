public class Java11_throws {
    static void checkAge(int age) throws Exception{
        if(age <18){
            throw new Exception("not eligible");
        }
        System.out.println("eligible");
    }
        public static void main(String[] args){
            try{
                checkAge(15);

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        
    }
    
}
