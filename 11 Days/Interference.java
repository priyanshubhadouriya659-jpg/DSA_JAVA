public class Interference {
    public static void main(String[] args) {
    car c1=new car();
    c1.start();
    c1.stop();
    bike b1=new bike();
    b1.start();
    b1.stop();
    }
}
interface vehicle {

    void start();
    void stop();
}
class car implements vehicle
{
    @Override
    public void start(){
        System.out.println("Starts the car");
    }
    public void stop()
    {
        System.out.println("stop the car");
    }
}
class bike implements vehicle
{
    @Override
    public void start()
    {
        System.out.println("Start thr bike");
    }
    public void stop()
    {
    System.out.println("Stop  the bike");
    }

}


