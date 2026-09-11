class A{

    public void show(){
        System.out.println("hello");

    }
    
}
class Java1_Annotation  extends  A{
    @Override 
    public  void show(){
        System.out.println("halla bolo ");

    }

   

    public static void main(String[] args) {
        A obj=new Java1_Annotation();
        obj.show();
       
    }

}