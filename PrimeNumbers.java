import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = s.nextInt();
        s.close();
        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return; 
        }
        
        int c = 2;

        while (num != 0) {
            boolean isPrime = true;
            for (int i = 2; i < c; i++) {
                if (c % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(c + " ");
                num--;
            }
            c++;
        }
    }
}