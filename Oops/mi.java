public class mi {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.color = "Black";
        System.out.println(d1.color);
        d1.legs = 4;
        System.out.println(d1.legs);
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

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    void bark(){
        System.out.println("Barks");
    }
}