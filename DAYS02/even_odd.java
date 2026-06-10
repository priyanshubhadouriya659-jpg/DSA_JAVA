import java.util.*;
class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        if(x %2==0)
        {
            System.out.println("your number is even "+x);
        }
        else
        {
            System.out.println("your number is odd "+x);
        }
    }
}