import java.util.*;

public class file03 {
    public static void main(String[] args) {
        Set<String> cars01 = new HashSet<>();
        Set<String> cars02 = new TreeSet<>();
        cars01.add("Maruti");
        cars01.add("Toyota");
        cars01.add("TATA");
        cars01.add("maruti");
        cars01.add("TATA");
        System.out.println(cars01);// any order unsorted

        cars02.add("Maturi");
        cars02.add("Toyota");
        cars02.add("TATA");
        cars02.add("maruti");
        cars02.add("TATA");
        System.out.println(cars02); // sorted order

        // 2. check if a value is present in set
        if (cars01.contains("TATA"))
            
        {
            System.out.println("present");
        }

        if(cars01.contains("volvo"))
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("not Present");
        }
        //for-each
        for(String it:cars01)
        {
            System.out.println("Car's name "+it);//it-->iteration
        }
    }
}
