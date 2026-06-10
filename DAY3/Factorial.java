 import java.util.*;
public class Factorial {
    public static void main(String[] args)
    {
        System.out.print("Enter the number ");
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
        int Factorial=1;
        if(x==0)
        {
            System.out.print("factorial is 1");
        }
      else if(x>=1){
        for(int i=1; i<=x ; i++)
        {
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);
    }
    
else {
    System.out.print("Undefined");
}
    }
}
