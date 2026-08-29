public class Java44_Multiple_object {
    String user_name;
    
    void show(String name){
        user_name=name;
        System.out.println("name => "+user_name);
        
    }


    public static void main(String[] args) {
        Java44_Multiple_object obj1=new Java44_Multiple_object();

        Java44_Multiple_object obj2=new Java44_Multiple_object();
        Java44_Multiple_object obj3=new Java44_Multiple_object();
        Java44_Multiple_object obj4=new Java44_Multiple_object();

        obj1.show("rahul");
        obj2.show("sandeep");
        obj3.show("vijay");
        obj4.show("annu");
    }
}
