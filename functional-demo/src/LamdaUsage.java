import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class LamdaUsage {
   public static void main(String[] args) {
	   List <Integer> list = new ArrayList<>();
	   list.add(10);
	   list.add(-5);
	   list.add(32);
	   list.add(7);
	   
	   list.forEach((Integer element) ->{
		   System.out.println(element);
	   });
	   
	   System.out.println("----------After Sorting -------------");
	   
//	   list.sort(new Comparator<Integer>() {
//		   @Override
//		   public int compare(Integer arg0, Integer arg1) {
//			   return arg0 - arg1;
//		   }
//	   });
	   
	   Comparator<? super Integer> sortLambda = (Integer arg0 , Integer arg1) -> arg0 - arg1;
	   
	   list.sort(sortLambda);
	   
	   System.out.println(list);
   }
}
