import java.util.*;
public class reverse_of_number

{
    public static  void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); 
        for(int i=n;i>=1;i--){
            System.out.println(+i);
        }
    }
}