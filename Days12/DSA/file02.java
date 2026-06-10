import java.util.*;
public class file02
{
	public static void main(String[] args) {
	
	List<Integer> nameLanguages = new ArrayList<>();
	nameLanguages.add(1);
	nameLanguages.add(3);
	nameLanguages.add(2);
System.out.println(nameLanguages.get(0));//value get/fetch
nameLanguages.set(0,78);
System.out.println(nameLanguages);
	Collections.sort(nameLanguages);

System.out.println(nameLanguages);

	}
}
