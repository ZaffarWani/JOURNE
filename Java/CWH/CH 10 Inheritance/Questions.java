// Q1
class Circle {
    public int radius;

    Circle(int r) {
        this.radius = r;
        System.out.println(" i m circle constructor ");
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("i am cylinder constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * height;
    }
}
// Q2

class Rectangle {
    public int lenght;
    public int breadth;

    Rectangle(int l, int b) {
        this.breadth = b;
        this.lenght = l;
        System.out.println(" Rectangle Constructor");
    }

    public int area() {
        return this.breadth * this.lenght;
    }
}

class Cube extends Rectangle {
    public int height;

    Cube(int l, int b, int h) {
        super(l, b);
        System.out.println("cube constructor");
        this.height = h;
    }

    public int volume() {
        return this.height * this.breadth * this.lenght;
    }
}

public class Questions {
    public static void main(String[] args) {

        // Q1
        Cylinder obj1 = new Cylinder(12, 14);
        System.out.println(obj1.area());
        // Q2
        Cube ch = new Cube(12, 113, 14);
        System.out.println(ch.area());
    }

}
