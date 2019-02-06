package objects;

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        //d.Bark();
        d.walk();
        Dog.run();
    }
}

class Animal{
    public void walk(){
        System.out.println("walking...");
    }
    public static void run(){
        System.out.println("running static");
    }
}

class Dog extends Animal{
    public void Bark(){
        System.out.println("barking...");
    }

    public static void eat(){
        System.out.println("eating static");
    }
}
