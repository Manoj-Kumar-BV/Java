public class hb {
    public static void main(String[] args) {
        piranha pir = new piranha();
        pir.swim();

        shark shr = new shark();
        shr.swim();

        peacock pea = new peacock();
        pea.fly();
        pea.eat();

        pegion peg = new pegion();
        peg.fly();
        peg.breathe();

        Dog dog = new Dog();
        dog.breathe();
        dog.bark();

        Cat cat = new Cat();
        cat.breathe();
        cat.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("Walks");
    }
}

class shark extends Fish{
    //some functions 
}

class piranha extends Fish{
    //some functions
}

class pegion extends Bird{
    //some functions
}

class peacock extends Bird{
    //some functions
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Barks");
    }
}

class Cat extends Mammal{
    //some functions
}