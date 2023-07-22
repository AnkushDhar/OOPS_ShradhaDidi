class Student1 {
    String name;
    int roll;
    String password;
    int [] marks;
    
    // shallow copy constructor
    // Student1 (Student1 s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student1 (Student1 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student1 () {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }
    Student1 (String name) {
        marks = new int[3];
        this.name = name;
    }
    Student1 (int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Ankush";
        s1.roll = 31;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student1 s2 = new Student1(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
