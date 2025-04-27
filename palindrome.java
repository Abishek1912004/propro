package propro;



import java.util.*;

class palindrome
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       multi(n); // Now you can call it because both are static
    }

    public static void multi(int n) // Add static here
    {
        int c = n * n;
        System.out.println(c);
    }
}
