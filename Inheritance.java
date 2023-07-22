// Base class
class Animal {
    String color;
    void eat () {
        System.out.println("eats");
    }
    void breathe () {
        System.out.println("breathes");
    }
}
// Derived class
// class Fish extends Animal {
//     int fins;
//     void swim () {
//         System.out.println("swims in water");
//     }
// }
class Fish extends Animal {
    void swim () {
        System.out.println("swims");
    }
}
class Bird extends Animal {
    void fly () {
        System.out.println("flies");
    }
}
class Mammals extends Animal {
    void walk () {
        System.out.println("walks");
    }
}
// class Dog extends Mammals {
//     String breed;
// }
public class Inheritance {
    public static void main(String[] args) {
        // Fish f1 = new Fish();
        // f1.eat();
        // Dog d1 = new Dog();
        // d1.eat();
        // d1.legs = 4;
        // System.out.println(d1.legs);
        Fish f1 = new Fish();
        Bird b1 = new Bird();
        Mammals m1 = new Mammals();
        
        //f1.fly(); 
        //f1.walk();
        f1.swim();
        f1.eat();
        f1.breathe();

        System.out.println();

        //b1.walk();
        //b1.swim();
        b1.fly();
        b1.eat();
        b1.breathe();

        System.out.println();

        //m1.swim();
        //m1.fly();
        m1.walk();
        m1.eat();
        m1.breathe();
    }
}
