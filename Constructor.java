// parameterized constructor 
// class RectangleArea
// {
//     int a;
//     int b;
//     RectangleArea(int a, int b)
//     {
//         this.a = a;
//         this.b = b;
//     }
//     int getArea(int a, int b)
//     {
//         return a*b;
//     }
//     void display()
//     {
//         System.out.println("The area of rectangle is "+ getArea(a,b));
//     }
// }

// public class Constructor {
//     public static void main(String[] args) {
//         RectangleArea ra = new RectangleArea(2, 5);
//         ra.display();
//     }
// }

// no arguments constructor 
class RectangleArea
{
    int a;
    int b;
    RectangleArea()
    {
        a = 56;
        b = 24;
    }
    void getArea()
    {
        System.out.println(a*b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        ra.getArea();
    }
}

