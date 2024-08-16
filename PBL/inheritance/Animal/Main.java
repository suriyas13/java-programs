class Animal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("I nEating");
    }

    @Override
    public void sleep() {
        System.out.println("I Sleeping");
    }

    public void fly() {
        System.out.println("I flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}
