
import java.util.*;
class palindrome
{
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       multi(n);
       
    }

    public static void multi(int n)
    {
        int c=n*n;
       System.out.println(c);
    }

    public static void add(int n)
    {
        int c=n+n;
       System.out.println(c);
    }import java.util.*;
class Palindrome
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n = sc.nextInt();
       sc.close();
       multi(n);
       add(n);
    }

    public static void multi(int n)
    {
        int result = n * n;
        System.out.println("Square of " + n + " is: " + result);
    }

    public static void add(int n)
    {
        int result = n + n;
        System.out.println("Double of " + n + " is: " + result);
    }
}
}