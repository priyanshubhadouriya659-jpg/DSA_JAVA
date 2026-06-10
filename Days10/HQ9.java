import java.util.*;

class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer");
        String name = sc.nextLine();
        char[] ch = name.toCharArray();//convert string into array
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='H'||ch[i]=='Q'||ch[i]=='9')
            { 
                //aleternative
                // char c=ch.charAt(i);
                System.out.println("yes");
                System.exit(0); //program shut down immedialry
            }
            
    
        }
       System.out.println("NO");
    }
}