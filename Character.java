import java.util.Scanner;

public class Character {
    public static void main(String[] args) 
    {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        ch = s.next().charAt(0);
        try{
            if(!Character.isLetter(ch))
            {
                throw new Exception("Please enter characters");
            }
            System.out.println("Your input is " +ch);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
