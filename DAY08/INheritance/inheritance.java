class vehicle {
    String name;
    int no_of_vehicle;
    String fuel_types;

    vehicle(String name, int no_of_vehicle, String fuel_types) {
        this.name = name;
        this.no_of_vehicle = no_of_vehicle;
        this.fuel_types = fuel_types;
    }

    void run() {
        System.out.println("car is runnning");
    }

}

class car extends vehicle {
    int no_of_seat;
  
car()
{
      super();
}
    car(vehicle v, int no_of_seat) {

        super(v.name, v.no_of_vehicle, v.fuel_types);
        this.no_of_seat = no_of_seat;
    }

    void display() {
        // using inherited variables: NO redefinition
        super.run();
        System.out.println("Name : " + name);
        System.out.println("Count : " + no_of_vehicle);
        System.out.println("Fuel : " + fuel_types);
        System.out.println("Seats: " + no_of_seat);
    }

}

public class inheritance {
    public static void main(String[] args) {

        vehicle v1 = new vehicle("truck", 4, "diesel");
        car c1 = new car(v1, 25);
        // c1.run();
        c1.display();

    }
}
