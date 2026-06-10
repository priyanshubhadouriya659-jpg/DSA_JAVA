import java.util.*;
import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the buckrt rq ");
        int x= sc.nextInt();
        int[] arr= new int[x];
        System.out.println("Enter the "+x+" number as per your requirement");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
            max=arr[i];
            }
        }
        System.out.print("Maximum Number :"+max);
    }
}