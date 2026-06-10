class Student{ 
   String name;
   int ROLL,age;
Student()
{
    name="GIRAND SINGH BHADOURIYA";
     ROLL=78;
     age=0;
}
Student(String name,int R,int a)
{  this.name=name;
   ROLL=R;
   age=a;
}
 void display()
 { 
    System.out.println("Name="+name);
    System.out.println("ROll="+ROLL);
    System.out.println("Age="+age);
 }
}
public class STUDENT_CLASS {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.ROLL=89;
       s1.display();
      
           Student s2=new Student("Priyanshu",78,18);
           s2.display();       
       
    }
}
