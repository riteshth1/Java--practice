// class Base
// {
//     void show()
//     {
//         System.out.println("Parent's show");
//     }
// }
// class Child extends Base{
//     void show()
//     {
//         System.out.println("child's show");
//     }
// }

// public class MethodOverriding {
//     public static void main(String[] args) {
//         Child c =  new Child();
//         c.show();   
//     }
// }

//object class 
// class Student
// {
//     int roll;
//     String name;
//     String city;
//     Student(int roll, String name, String city)
//     {
//         this.roll = roll;
//         this.name = name;
//         this.city = city;
//     }
//     public  String toString()
//     {
//         return roll+" "+ name +" "+  city;
//     }
// }
// public class MethodOverriding {
//     public static void main(String[] args) {
//         Student s = new Student(1,"Ritesh","Htd");
//         System.out.println(s);
//     }
// }

/* interface */
// interface ExA
// {
//     void MethodA();
// }
// interface ExB
// {
//     void MethodB();
// }
// class MyClass implements ExA ,ExB
// {
//     public void MethodA()
//     {
//         System.out.println("The method is A");
//     }
//     public void MethodB()
//     {
//         System.out.println("The method is B");
//     }
// }
// public class MethodOverriding {
//     public static void main(String[] args) {
//         MyClass m = new MyClass();
//         m.MethodA();
//         m.MethodB();
//     }
// }

// Multilevel inheritance
class Sup{
    public void disSup()
    {
        System.out.println("This is superclass");
    }
}
class Parent extends Sup{
    public void displaysub()
    {
        System.out.println("This is subclass");
    }
}
class Child extends Parent
{
    public void display()
    {
        System.out.println("this is child class");
    } 
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.disSup();
        c.displaysub();
    }
}