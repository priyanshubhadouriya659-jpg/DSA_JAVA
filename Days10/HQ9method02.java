import java.util.*;
public class HQ9method02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value");
        String name=sc.nextLine();
        boolean output=false;
        for(int i=0;i<name.length();i++)
        {
                char c=name.charAt(i);
                if(c=='H'||c=='Q'||c=='9')
                {
                  output= true;
                  break;
                }
        }
            if(output==true)
            {
                System.out.println("YES");
            }
            System.out.println("No");
    }
}
