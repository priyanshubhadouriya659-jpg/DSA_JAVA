 class Abstract {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.sound();
        cat c1=new cat();
        c1.sound();
    }
}
abstract class Animal
{
    abstract void sound();
   public void sleep()
   {
    System.out.println("Animql is sleeping");
   }
}

class dog extends Animal
{
    @Override
    void sound(){
        System.out.println("The adogs is barks");
    }
}

class cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println(" meow");
    }
}