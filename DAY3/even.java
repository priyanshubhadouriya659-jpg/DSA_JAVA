import java.util.*;
public class even {
    public static void main(String[] args)
    {   
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        
        for(int i=1;i<=x;i++)
        {  
            if(i %2==0)
            {
                System.out.println(i);
            }
            else{
                System.out.println("not a even");
            }
        }
    }

}
