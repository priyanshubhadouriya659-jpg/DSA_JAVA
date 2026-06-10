import java.util.*;
public class Countoddnumbers {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the bucker rq");
        int x=sc.nextInt();
        int[] arr =new int[x];
        System.out.println("Enter the element in array ");
        for(int i=0;i<x;i++)
        {
           arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]%2!=0)
             {
                count++;
             }
        }
        System.out.println(count);
    }
}
