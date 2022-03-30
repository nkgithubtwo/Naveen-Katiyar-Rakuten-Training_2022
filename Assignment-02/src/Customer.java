public class Customer {
	
	 int CustomerId;
	   String CustomerName;
	   String CustomerAddress;
	   String CustomerTel;
	   String CustomerEmail;
	   
	   static int counter = 1000;
	   
	   public Customer(String name , String Add , String tel , String email) {
		   this.CustomerName = name;
		   this.CustomerAddress = Add;
		   this.CustomerTel = tel;
		   this.CustomerEmail = email;
		   
		   this.CustomerId = setCustomerId();
	   }
	   
	   private int setCustomerId() {
		   
		   counter++;
		   return counter;
		   
	   }
	   
	   void displayDetail() {
		   System.out.println("Customer ID : " + this.CustomerId);
		   System.out.println("Customer Name : " + this.CustomerName);
		   System.out.println("Customer Addrress : " + this.CustomerAddress);
		   System.out.println("Customer Telephone : " + this.CustomerTel);
		   System.out.println("Customer Email : " + this.CustomerEmail);
		   
		   System.out.println();
	   }
	
	public static void main(String[] args) {
		Customer c1 = new Customer("Naveen" , "Kanpur" ,"8984872892" ,"xyz@gmail.com");
		Customer c2 = new Customer("Ashish" , "Banglore" ,"88797989892" ,"abc@gmail.com");
	     c1.displayDetail();
	     c2.displayDetail();
	}
}



