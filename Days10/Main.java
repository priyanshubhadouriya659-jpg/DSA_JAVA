public class Main {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.display();
        
        // c1.display();
    }
}
class shape
{
    String color="red";
   
}
class circle extends shape
{
    String color="YEllow";
    void display()
    {
        System.out.println("Colour in circle "+color);
        System.out.println("colour of shape "+ super.color); 
    }
} 
    

