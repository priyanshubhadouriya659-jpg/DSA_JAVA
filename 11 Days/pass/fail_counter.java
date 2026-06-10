import java.util.*;
public class fail_counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr= new int[x];

        for(int i=0;i<x;i++)
        {
            arr[i]= sc.nextInt();
        }
        int count=0;
        for(int i=0;i<x;i++)
        {
            if(arr[i]>40)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}