//import java.util.HashSet;
import  java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<String> names = new TreeSet<>();
         
         for(int i = 0; i < 100 ; i++) {
        	 names.add("Ram" + i);
         }
         
         System.out.println(names);
	}

}
