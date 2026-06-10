import java.util.Scanner;

public class Search_an_element {
    public static void main(String[] args)
    {
        System.out.print("Enter the bucket size ");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
System.out.println("entre the elemrnt of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number want to fid their posion ");
        int key=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            {
                System.out.print(i+" ");
            }

        }
    }
}
