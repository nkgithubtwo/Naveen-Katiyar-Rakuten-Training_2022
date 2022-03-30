enum TYPE{
	SB,
	FD;
}

public class Account{
	 
   private int AccountNum;
   String AccountOpenDate;
   TYPE type;
   double AccountBal;
   private Customer Customer;
   
   static int counter = 1000000;
   
   public Account(String accountOpenDate, double accountBal , TYPE AccountType) {
	super();
	this.AccountOpenDate = accountOpenDate;
	this.AccountBal = accountBal;
	this.type = AccountType;
	this.AccountNum = generateAccountNo();
}


 private int generateAccountNo() {
	   return counter++;
 }
 
 
 public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer customer) {
		this.Customer = customer;
	}
   void displaydetails(){
	   System.out.println("Account Number : " + AccountNum);
	   System.out.println("Customer ID : " + Customer);
	   System.out.println("Account Type : " + type);
	   System.out.println("Account Creation Date : " + 	AccountOpenDate);
	   System.out.println("Account Balance : " + AccountBal);
	   
   }
   
   public static void main(String[] args) {
	  
	   TYPE type = TYPE.SB;
	   Account ac = new Account("20-03-2012", 1006756 ,type);
	   ac.displaydetails();
	   
   }
}