class Box<T>{
    private T value;

    public void setValue(T value){
        System.out.println(this.value=value);
    }

    public T getValue(){
        return value;
    }
}
class Java1_Generic_class{
    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.setValue("java");

                Box<Integer> intBox=new Box<>();
        intBox.setValue(1000);

        System.out.println(stringBox.getValue());
        System.out.println(intBox.getValue());
    }
}