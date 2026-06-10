class Student
{
    static int roll=78;
    Integer a1=90;
    Integer a2=90;
    boolean s;//default false
    void display()
    {
    System.out.println(a1==a2);  //true  compare reference
    System.out.println(a1.equals(a2)); //compare value
     System.out.println(s); //prints default value of boolean="false";
    }
}
public class Static02 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
    }
}

