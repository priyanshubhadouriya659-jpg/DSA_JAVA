import java.util.*;

public class no_of_vowels
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
       
        int count=0; 
        String str = sc.nextLine();   
        for(int i=0 ;i<str.length();i++)
            {
            char ch= str.charAt(i);
                  {
                    if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u')
                    {
                        count++;
                    }
                  
                }
        }
        System.out.print(count);
    }
}