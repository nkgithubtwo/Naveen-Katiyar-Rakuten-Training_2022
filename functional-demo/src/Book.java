import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Book {
	public static void main(String[] args) {
		
		ArrayList <Integer> list= new ArrayList<Integer>(); 
		
		list.add(234);
		list.add(344);
		list.add(500);
		list.add(300);
		
		Collections.sort(list , (a , b) -> (a < b) ? -1 : (a > b) ? 1 : 0);
		
		System.out.println(list);
		
	}

}
