// public class Pattern {
//     public static void main(String[] args) {
//         String word = "Nepal";
//         for(int i = 0;i<word.length();i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print(word.charAt(j));
//             }
//             System.out.println();
//         }        
//     }
    
// }

public class Pattern {
    public static void main(String[] args) {
        String word = "Nepal";
        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j < word.length(); j++) 
            {
                if (i == j) 
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}

