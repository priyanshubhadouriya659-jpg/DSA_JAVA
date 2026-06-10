class Student
{
   static String name="Priyanshu";
   static void display()
   {
    System.out.println(name);
   }
}
class STATIC
{
    public static void main(String[] args)
    {
      Student s1=new Student();
      System.out.println(s1.name);
       s1.display();
      s1.name="aditya";
      s1.display();
    
   }
}