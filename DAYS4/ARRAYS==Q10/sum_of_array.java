import java.util.*;

public class sum_of_array
{
    public static void main(String[] args)
    { 
          Scanner sc= new Scanner(System.in);
          int arr[]=new int[100];
          int sum=0;
          System.out.println("Enter the number");
          int n= sc.nextInt();
           System.out.print("Enter the "+n+" number");
           for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("YOUR enter number ");
        for(int i=0;i < n;i++)
            {  
        System.out.print(arr[i]+" ");
            }
            for(int i=0;i<n;i++)
            {
                sum = sum +arr[i];
            }
            System.out.print("\nsum of two number "+sum);
    }
}