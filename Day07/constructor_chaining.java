class Student
{
    int x;
    Student()
    {
        this(10);
        //
    }
    Student(int x)
    {
        System.out.println(x);
    }
    void display()
    {
        System.out.println(x);
    }
}
class constructor_chaining
{
   public static void main(String[] args)
   {
      Student s1=new Student(); //10
    //   s1.display();
   }
}