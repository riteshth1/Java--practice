// 3.1 Write a program to create a class Box with attributes length and breadth. Add a constructor to initialize the object, a method getLength() to return the length, a method getBreadth() to return breadth and a method area() to find the area of the box. Create a main class named BoxDemo to create two objects and display the largest area.

class Box {
    int length;
    int breadth;

    Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getLength() {
        return length;
    }

    int getBreadth() {
        return breadth;
    }

    int area() {
        return getLength() * getBreadth();
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(5, 6);
        Box b2 = new Box(7, 8);
        if (b1.area() > b2.area()) {
            System.out.println("The largest area is " + b1.area());
        } else {
            System.out.println("The largest area is " + b2.area());
        }
    }
}
