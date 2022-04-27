
class ExceptionHandling {
	
	static void main(String[] args) {
		try {
			def arr = new int[3];
			arr[5] = 4;
		}catch(ArrayIndexOutOfBoundsException ex) {
			println(ex.toString());
			println(ex.getMessage());
			println(ex.getCause());
		    println("Array index of bound exception")
		}catch(Exception ex) {
			println("Catching the exception")
		}finally {
			println("The final Block")
		}
		
		println("Let's move on after the exception")
	}
}
