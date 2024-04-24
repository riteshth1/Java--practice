// Write a program to create a class Shape with two methods named area() to implement the concept of method overloading. One method to find the area of rectangle and another to find the area of square. Create a main class ShapeDemo to create the object and call the methods.

class Shape {
    void area(int length, int breadth) {
        System.out.println("The area of rectangle is " + (length * breadth));
    }

    void area(int length) {
        System.out.println("The area of square is " + (length * length));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);
        s.area(2, 6);
    }
}
