abstract class Animal {
    String color;
    Animal () {
        color = "Brown";
    }
    void eat () {
        System.out.println("Animal eats");
    }
    abstract void walk ();
}

class Horse extends Animal {
    void changeColor () {
        color = "Dark brown";
        System.out.println(color);
    }
    void walk () {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void changeColor () {
        color = "Yellow";
        System.out.println(color);
    }
    void walk () {
        System.out.println("walks on 2 legs");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);
        h1.changeColor();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        System.out.println(c1.color);
        c1.changeColor();

        //Animal a = new Animal();
    }
}
