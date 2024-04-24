//Write a program to change the main diagonals elements of a matrix by user given no.

import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int n;
        int a[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix:");
        for(int i = 0;i < 2; i++)
        {
            for(int j = 0;j < 3 ;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the digit to change main diagonal with it:");
        n = sc.nextInt();
        sc.close();
        for(int i = 0;i < 2; i++)
        {
            a[i][i] = n;
        }
        System.out.println("\nThe modified matrix is : ");
        for(int i = 0;i < 2; i++)
        {
            for(int j = 0;j < 3 ;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
