import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[]  args) throws IOException {
    	Book book = new Book();
    	try {
			try {
				book.setPrice(1000);
			} catch (InavlidPriceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
