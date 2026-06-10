import java.util.*;
import java.util.Arrays;
public class average
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int sum =0;
        System.out.println("enter the number ");
        int n = sc.nextInt();
     
        for(int i=0;i<n;i++)
    {
         arr[i]=sc.nextInt();
    }
    // for(int i=0)
    for(int i=0;i<n;i++)
    {
        sum= sum+arr[i];
    }
    System.out.println("average of input numbers is "+sum/n);

    }
}