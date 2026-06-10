import java.util.*;
public class Greatest_of_three_no {
     public static void main(String[] args)
     {
         System.out.println("enter 3 number ");
         Scanner sc=new Scanner(System.in);
         float x1=sc.nextFloat();
         float x2=sc.nextFloat();
         float x3=sc.nextFloat();
         if(x1>x2&& x1>x3)
         {
            System.out.println("Greatest Number is "+x1);
         }
         else if(x2>x1 && x2>x3)
         {
            System.out.println("Greatest Number is"+x2);
         }
         else
         {
            System.out.println("greatest number is "+x3);
         }
     }
}
