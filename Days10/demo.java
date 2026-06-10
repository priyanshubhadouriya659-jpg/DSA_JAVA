public class demo
{
    public static void main(String[] args) {
        Animal n=new Animal("dogs", 4);
        cat c1=new cat("cat", 4);
        n.eats();
        c1.sound();
            puppy p1=new puppy("puppy", 4);
            p1.sound();
    }
}
class Animal
{
    String name;
    int no_of_legs;
    void eats()
    {
        System.out.println("animal ");
    }
Animal(String name,int no_of_legs)
{
    this.name=name;
    this.no_of_legs=no_of_legs;
}


}
class cat extends Animal//extends -->increse karna
{ 
    cat(String name, int no_of_legs) {
        super(name, no_of_legs);
    }

    void sound()
    {
        System.out.println("meow");
    }
}
class puppy extends cat{
    puppy(String name,int no_of_legs)
{
    super(name,no_of_legs);
} 
void sound()
{
    System.out.println("bow");
}
}