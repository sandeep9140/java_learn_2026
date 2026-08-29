public class Java53_this_keyword {
    String name;
    Java53_this_keyword(String name){
        this.name=name;

    }
    public static void main(String[] args) {
       Java53_this_keyword obj= new Java53_this_keyword("sandeep");
        System.out.println(obj.name);
    }
    
}
