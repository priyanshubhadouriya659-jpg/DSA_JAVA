import java.util.*;
public class Grade {
    public static void main(String[] args)
    {   System.out.print("enter your marks");
        Scanner sr=new Scanner(System.in);
        float Grade_marks=sr.nextFloat();
   if(Grade_marks== 30)
   {
      System.out.print("D");
   }
   else if(Grade_marks>30 && Grade_marks <=60)
   {
     System.out.print("B");
   }
   else if(Grade_marks>70 && Grade_marks<=90){
    System.out.print("A");
   } else if(Grade_marks>90){
     System.out.print("A+");
   }
    }
}
