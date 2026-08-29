public class Java54_this_keyword {
    void display(){
        System.out.println("display method");
    }

    void test(){
        this.display();
    }
    public static void main(String[] args) {
        Java54_this_keyword obj=new Java54_this_keyword();
        obj.test();
    }
}
