// 1. ABSTRACT PARENT CLASS
abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method: no body {}
    public abstract double calculateArea();

    // Concrete method: formats area to 2 decimal places using %.2f
    public void displayInfo() {
        System.out.println("Shape Color: " + color);
        System.out.printf("Calculated Area: %.2f\n", calculateArea());
    }
}

// 2. CHILD CLASS 1
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// 3. CHILD CLASS 2
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// 4. MAIN CLASS (Must match file name "abstraction")
public class abstraction {
    public static void main(String[] args) {
        Shape c = new Circle("Red", 5.0);
        Shape r = new Rectangle("Blue", 4.0, 6.0);

        c.displayInfo();
        System.out.println("----------------------------");
        r.displayInfo();
    }
}