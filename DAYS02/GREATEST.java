// Given two integers, n and m. The task is to check the relation between n and m. 
// Print "less" if n < m,  "equal" if n == m, and "greater" if n > m.
import java.util.Scanner;

class GREATEST {
    public static void main(String[] args) {
        System.out.println("enter the number 2");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if(n<m)
        {
            System.out.print("less");
        }
        else if(n==m)
        {
            System.out.print("equal");
        }
        else if(n>m)
        {
            System.out.print("greater");
        }
    }
}