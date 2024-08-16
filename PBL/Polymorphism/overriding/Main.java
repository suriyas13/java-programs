
class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String n, String t, String s) {
        name = n;
        taste = t;
        size = s;
    }

    public void eat() {
        System.out.println("Fruit Class");
        System.out.println(name);
        System.out.println(taste);
    }
}

class Apple extends Fruit {
    public Apple(String n, String t, String s) {
        super(n, t, s);
    }

    @Override
    public void eat() {
        System.out.println(name);
        System.out.println(taste);
    }
}

class Orange extends Fruit {
    public Orange(String n, String t, String s) {
        super(n, t, s);
    }

    @Override
    public void eat() {
        System.out.println(name);
        System.out.println(taste);
    }
}

public class Main {
    public static void main(String[] args) {
        Fruit o = new Orange("Orange", "sweet", "M");
        Fruit a = new Apple("Apple", "sweet", "M");
        o.eat();
        a.eat();
    }
}
