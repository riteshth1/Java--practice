public class Reverse {
    public static void main(String[] args) 
    {
        int []a = new int[]{5,10,98,18,49,65,2,4,5,8,6};  
        System.out.println("Original Array:");
        for(int i : a)
        {
            System.out.print(i+" "); 
        }
        for(int i = 0;i < a.length/2;i++)
        {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        System.out.println("\nReversed Array:");
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }
}
