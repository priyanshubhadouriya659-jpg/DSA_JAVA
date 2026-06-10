import java.util.*; //package
public class file01
{
   public static void main(String[] args)
   {
      // Array list
     List<String> codingLanguages = new ArrayList<>();
     //add from ending backside one by one 
      codingLanguages.add("C");
      codingLanguages.add("Python");
      codingLanguages.add("Java");
      codingLanguages.add("C++");
     codingLanguages.add("FORTAL");
     //2. add at a specific index
     codingLanguages.add(5,"Rust");
     codingLanguages.add(6,"Go");
     System.out.println(codingLanguages);
     System.out.println("value at index 2 "+codingLanguages.get(2));
     //Access update
     codingLanguages.set(2,"Anacoda"); //update value at particluar index
     System.out.println(codingLanguages);
     System.out.println("\nGet value ");
     System.out.println(codingLanguages.get(5));
//remove
codingLanguages.remove(2);
System.out.println(codingLanguages);
//sorting METHOD 01
codingLanguages.sort(null);
System.out.println(codingLanguages);
System.out.println();
// sorting METHOD 02
Collections.sort(codingLanguages,String.CASE_INSENSITIVE_ORDER); //use for ignore captical or small 
System.out.println(codingLanguages);

System.out.println("Size of arraylist :"+codingLanguages.size());

//for - each
for(String it:codingLanguages)
{
   System.out.println("language "+it);
}

   }
}