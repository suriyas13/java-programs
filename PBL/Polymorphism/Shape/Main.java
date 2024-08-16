/*Using polymorphism, you can treat different shapes uniformly and write more generic and reusable code */
class Shape {
    public void Draw() {
        System.out.println("Drawing");
    }

    public void Erase() {
        System.out.println("Erasing");
    }
}

class Circle extends Shape {
    @Override
    public void Draw() {
        System.out.println("Drawing Cricle");
    }

    @Override
    public void Erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    @Override
    public void Draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void Erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    @Override
    public void Draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void Erase() {
        System.out.println("Erasing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        // Shape c = new Circle();
        // Shape t = new Triangle();
        // Shape s = new Square();
        // c.Draw();
        // c.Erase();
        // t.Draw();
        // t.Erase();
        // s.Draw();
        // s.Erase();
        Shape[] shapes = { new Circle(), new Triangle(), new Square() };

        for (Shape shape : shapes) {
            shape.Draw();
            shape.Erase();
        }
    }
}
