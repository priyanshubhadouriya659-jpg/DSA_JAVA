import java.util.*;
public class Minimum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bucket required");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array element "+n);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int Minimum=arr[0];
       for(int i=0;i<n;i++)
       {
           if(arr[i]<Minimum)
           {
            Minimum=arr[i];
           }
       }
       System.out.println("Minimum "+Minimum);
    }
}