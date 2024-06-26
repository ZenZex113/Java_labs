import Student.Student;
import Wrapper.Wrapper;
public class Main
{
    public static void main(String[] args)
    {
        Student st1 = new Student("Alexander", "Zenkov", 20, "5030102/10101" );
        Student st2 = new Student("Nikita", "Ivanov", 30, "10");
        System.out.println("st1: ");st1.print();
        System.out.println("st2: ");st2.print();
        Wrapper<Student> inst1 = new Wrapper<>(st1);
        Wrapper<Student> inst2 = new Wrapper<>(st2);

        inst1.swap(inst2);
        st1 = inst1.getData();
        st2 = inst2.getData();

        System.out.println("former st1: ");st1.print();
        System.out.println("former st2: ");st2.print();

    }
}