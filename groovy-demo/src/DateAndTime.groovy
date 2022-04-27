
class DateAndTime {
	
	static void main(String[] args) {
		Date date = new Date(100);
		System.out.println(date.toString());
		
		Date oldDate = new Date("02/01/2012");
		Date newDate = new Date("01/04/2021");
		Date latestDate = new Date();
		
		println(oldDate.after(newDate));
		println(newDate.after(oldDate));
		
		println(oldDate.equals(oldDate))
		
		println(newDate.compareTo(newDate));
		println(latestDate.compareTo(newDate));
		
		println(latestDate.toString());
	
		println(oldDate.before(latestDate));
		
		println(latestDate.getTime());
		
		oldDate.setTime(10000);
		println(oldDate.toString());
		
	}
}
