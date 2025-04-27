package propro;
import java.util.*;

class palindrome
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       add(n); 
    }

    public static void add(int n) 
    {
        int c = n + n;
        System.out.println(c);
}
