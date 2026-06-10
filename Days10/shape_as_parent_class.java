public class shape_as_parent_class {
    public static void main(String[] args) {
        shape s1=new shape("red");
        circle c1=new circle("red","blue");
        c1.display();
        
    }
}
class shape
{
    String color="red";
    shape(String color)
    {
        this.color=color;

    }
}

class circle extends shape

{
    String own_color="Blue";
    circle(String color,String own_color)
    {
        super(color);
        // this.color=color;
        this.own_color=own_color;
        
        
    }
    void display()
    {
        System.out.println("color of shape is "+color);
        System.out.println("color of circle is "+own_color);
    }

}