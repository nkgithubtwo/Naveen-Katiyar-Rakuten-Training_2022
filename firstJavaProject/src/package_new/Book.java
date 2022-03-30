package package_new;
import java.util.*;

public class Book {

//	private String title;
//	private float price;
//	private STATUS status;
//	
//	public void setStatus(STATUS status) {
//		this.status = status;
//	}
//	
//	public String getTitle() {
//		return Title;
//	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Bookdet[] obj = new Bookdet[10];
		
		for(int i = 0; i < 10 ; i++) {
			String str = sc.nextLine();
			int p = sc.nextInt();
			obj[i] = new Bookdet(str , p);
		}
		System.out.println(obj[0].book_name);
		
	}
	

	
	
}

class Bookdet
{
	String book_name;
	int book_price;
	
	Bookdet(String name , int price){
		book_name = name;
		book_price = price;
	}
	
}

