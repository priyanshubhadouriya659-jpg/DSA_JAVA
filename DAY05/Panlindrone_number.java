import java.util.Scanner;

public class Panlindrone_number {
    
      public static void main(String[] args) {
            Scanner stc= new Scanner(System.in);
            System.out.print("Enter the String ");
            
            String x=stc.nextLine();
            int n= x.length();
            String str="";
            // int 
            for(int i=n-1;i>=0;i--){
             char ch= x.charAt(i);
              str+=ch;
            } // yase se paindrone kiya tha 
             System.out.print(str);  
             if(x.equals(str))
             {
                System.out.println("\ntrue");
             }else{
                System.out.println("\nfalse");
             }
        }
        
    }



