import java.io.*;

class Student implements Serializable {

    String name;
    int age;

    transient String password;

    Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}

public class Java8_transient {

    public static void main(String[] args) {

        Student s = new Student("Sandeep", 20, "12345");

        try {
            // Object ko file mein save karna
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("student.txt"));

            out.writeObject(s);
            out.close();

            // Object ko file se wapas read karna
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("student.txt"));

            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println(s2.name);
            System.out.println(s2.age);
            System.out.println(s2.password);

        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}