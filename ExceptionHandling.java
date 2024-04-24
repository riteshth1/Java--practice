// import java.util.Scanner;
// class Test{
//     // int age;
//     // Test(int age)
//     // {
//     //     this.age = age;
//     // }
//     void ExceptionOccured(int age) throws ArithmeticException
//     {
//         // int c = age/0;
//         throw new ArithmeticException("Error!! Age can't be divide by zero");
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) 
//     {
//         int a=15;
//         int b[] = {2,5,6,8};
//         String myString = null;
//         int k=0;
//         try{
//             a=a/0;
//             b[4]=25;
//             k = myString.length();
//         }
//         catch(ArithmeticException e){
//             System.out.println(e.getMessage());
//         }
//         catch(ArrayIndexOutOfBoundsException e1){
//             System.out.println(e1.getMessage());
//         }
//         catch(NullPointerException ne){
//             System.out.println(ne.getMessage());
//         }
//     }
// }

// user defined exception
// import java.util.Scanner;

// class BankWithDrawException extends Exception {
//     BankWithDrawException(String msg) {
//         super(msg);
//     }
// }

// class Transaction {
//     int total_balance;

//     Transaction(int total_balance) {
//         this.total_balance = total_balance;
//     }

//     void checkTransaction(int temp) throws BankWithDrawException
//     {
//         try {
//             if (total_balance < temp) {
//                 throw new BankWithDrawException("You're out of balance.");
//             }
//             System.out.println("Congrats!! Your  transaction is successful");
//             total_balance -= temp;
//             System.out.println("The remaining balance is Rs."+ total_balance);
//         } catch (BankWithDrawException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int draw_amt;
//         System.out.println("Enter the amount you want to draw:");
//         draw_amt= sc.nextInt();
//         sc.close();
//         Transaction t = new Transaction(500000);
//         try {
//             t.checkTransaction(draw_amt);
//         } catch (BankWithDrawException ar) {
//             System.out.println(ar.getMessage());
//         }
//     }
// }

// rethrowing exception
// class Divide {
// int div(int a, int b) {
// try {
// return a / b;
// } catch (ArithmeticException e) {
// throw e;
// }
// }
// }

// public class ExceptionHandling {
// public static void main(String[] args) {
// Divide d = new Divide();
// try {
// System.out.println(d.div(2, 0));
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
public class ExceptionHandling {
    public static void main(String[] args) {
        // try-catch block
        int a = 22;
        try {
            a = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Divided by zero.");
        }
        // try-finally block
        try {
            a = a / 2;
        } finally {
            System.out.println("This code under finally will executed.");
        }
    }
}
