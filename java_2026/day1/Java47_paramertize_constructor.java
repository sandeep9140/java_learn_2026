public class Java47_paramertize_constructor {
    String uname;
     Java47_paramertize_constructor(String name){
        uname=name;
     }

     public static void main(String[] args) {
        Java47_paramertize_constructor obj=new Java47_paramertize_constructor("sandeep");
        System.out.println(obj.uname);
     }
}
