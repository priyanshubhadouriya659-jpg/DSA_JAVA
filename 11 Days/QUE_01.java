public class QUE_01 {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.area(78,0);
        Rectangle r1=new Rectangle();
        r1.area(500, 20);
    }
}
abstract class shape
{
    abstract public void area(int r,int s);

}
class circle extends shape{

 
    @Override
    public void area(int radius,int s) {
        System.out.println("arae of circle "+3.14*radius*radius);
    }
}
class Rectangle extends shape{
    @Override
    public void area(int lenght,int width )
    {
        System.out.println("Area of Rectangle "+lenght*width);
    }
}
