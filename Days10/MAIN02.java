public class MAIN02 {
    public static void main(String[] args) {
        // applicance a1 = new applicance();
        // a1.turnon();
        toaster t1 = new toaster();
        t1.turnon();

    }
}

class applicance extends toaster
{
    void turnon() {
        System.out.println("heating up bread");
    }
}

class toaster {
    void turnon() {
        System.out.println("rrr");
    }
}