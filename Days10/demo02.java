public class demo02 {
    public static void main(String[] args) {
        animal a1=new animal();

        a1.eats();
        dog d1=new dog();
        d1.bark();
        d1.eats();
        cat c1=new cat();
        c1.meow();  
        c1.eats();
        
        }
}
class animal
{
    void eats()
    {
        System.out.println("eats");
        
    }
}
class dog extends animal
{
    void bark()
    {
        System.out.println("barks");
    }
}
class cat extends animal
{
    void meow()
    {
        System.out.println("meows");
    }
}