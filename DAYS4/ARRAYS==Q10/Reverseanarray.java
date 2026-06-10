import java.util.*;
public class Reverseanarray{
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("ENter the bucket");
         int x=sc.nextInt();
         int arr[]= new int[x];
         System.out.println("Enter the array Elemrnt");
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt();
         }
        
         for( int last=(x-1);last>=0;last--)
         {
               System.out.print(" "+arr[last]);
         }
         
    }
}
