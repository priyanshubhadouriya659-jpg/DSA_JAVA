// 6. Count even numbers

import java.util.*;
public class Countevennumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number bucket rq");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the number ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i] % 2==0)
        {
            count++;
        }
     }
     System.out.print(count);
    
    }
}
