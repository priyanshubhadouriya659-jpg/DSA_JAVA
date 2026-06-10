class class_name
{
    String name="PRIYANSHU";
    int x;
    class_name(String name,int roll)
    {
        this.name=name;
        x=roll;
    }
    
    void display()
    {
        System.out.println("name ="+name);
        System.out.println("age ="+x);
    }
}
class class_using_this
{
    public static void main(String[] args)
    {
        class_name s1=new class_name("Girand singh",78);
        s1.display();
    }
}
