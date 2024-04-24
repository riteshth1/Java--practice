// // call by value
// class CallValue
// {
//     int a;
//     int b;
//     CallValue(int a,int b)
//     {
//         this.a = a;
//         this.b = b;
//     }
//     void sum()
//     {
//         System.out.println(a+b);
//     }
// }
// public class PassingArgs {
//     public static void main(String[] args) {
//         CallValue c = new CallValue(2, 9);
//         c.sum();
//     }
// }

class Abc
{
    int a = 5;
    class Xyz
    {
        void InnerMethod()
        {
            System.out.println("The valur of a is "+a);
        }
        void OuterMethod()
        {
            Xyz a = new Xyz();
            a.InnerMethod();
        }
    }
}
public class PassingArgs{
    public static void main(String[] args) {
        Abc s1 = new Abc();
        Abc.Xyz b1 = s1.new Xyz();
        b1.OuterMethod();

    }
}