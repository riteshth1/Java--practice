import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        int a,i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        a=s.nextInt(); 
        s.close();
        do{
            a=a/10;
            i++;
        }while(a>0);
        System.out.println("The digit in number is:"+ " "+i);
    }
}
