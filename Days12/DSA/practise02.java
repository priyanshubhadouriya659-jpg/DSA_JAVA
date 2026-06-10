
import java.util.*;

public class practise02 {
    public static void main(String[] args) {
        List<Integer>numIntegers =new ArrayList<>();
        numIntegers.add(78);
        numIntegers.add(23);
        numIntegers.add(96);
         System.out.println("Before Short List"+numIntegers);//before sort list
        numIntegers.sort(null); //null 
        System.out.println("After Short List"+numIntegers);
        //for-each for fetching data 
        for(int it:numIntegers)
        {
            System.out.print(it+" ");
        }
    }
}


