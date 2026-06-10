import java.util.*;
public class Palindrone_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        n=Math.abs(n);
        int rev=0,original_number;
             original_number=n;
       while (n>0) {
          int rem= n % 10;
          rev = rev * 10+ rem;
          n = n /10;
       }
       System.out.println("reversed "+rev);
       if(original_number==rev)
       {
          System.out.println("Palindrone number ");
       }
       else
       {
        System.out.print("Non - palindrone");
       }
    }
}
