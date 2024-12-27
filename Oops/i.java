public class i {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barks");
    }
}