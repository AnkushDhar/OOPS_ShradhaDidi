class Student {
    String name;
    int roll;

    Student () {
        System.out.println("Constructor is called...");
    }
    Student (String name) {
        this.name = name;
        System.out.println(this.name);
    }
    Student (int roll) {
        this.roll = roll;
        System.out.println(this.roll);
    }
    Student (String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println(this.name+" "+this.roll);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ankush");
        Student s3 = new Student(31);
        Student s4 = new Student("Ankush", 31);
    }
}
