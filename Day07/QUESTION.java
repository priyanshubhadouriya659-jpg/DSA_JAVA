class Student
{
    String name;
    float cgpa;
    Student(String name,float cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }

}
class faculty extends Student
{  
    double salary;
    String subject;
    faculty(double salary,String subject,String name,float cgpa)
    {
      super(name,cgpa);
      this.salary=salary;
      this.subject=subject;

    }
void display()
{
    System.out.println("Name="+name);
    System.out.println("salary="+salary);
    System.out.println("subject="+subject);
    System.out.println("cgpa="+cgpa);
}

}
public class QUESTION {
    public static void main(String[] args) {
        
        Student s1=new Student("priyanshu", 0);
        faculty f1=new faculty(234.5, "oso","priya",7.6f);
        f1.display();
       System.out.println(s1.name);
       System.out.println(f1.name);
    }
}
+