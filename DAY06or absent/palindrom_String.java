import java.util.*;
public class palindrom_String {
    
    public static boolean check(String x)
    {
        int i=0;
        int j=x.length()-1;
        while(i<j)
        {
            if(x.charAt(i)!=x.charAt(j))
            {
                        return false;
                    }
                        i++;
                        j--;
                }
                return true;
            
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String name=sc.nextLine();
        System.out.println(check(name));
    }
}

