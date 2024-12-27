public class hi {
    public static void main(String[] args) {
        Bird pegion = new Bird();
        pegion.fly();
        
        Mammals human = new Mammals();
        human.walk();
        human.eat();

        Fish shark = new Fish();
        shark.swim();
        shark.breathe();
    }
}

class Animal{
    void breathe(){
        System.out.println("Breathes");
    }

    void eat(){
        System.out.println("Eats");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}