class AddNum
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(double a, double b)
    {
        System.out.println(a+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        AddNum ad = new AddNum();
        ad.add(2, 30);
        ad.add(5,55.4656); 
    }
}
