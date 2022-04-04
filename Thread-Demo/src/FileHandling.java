import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class FileHandling {

	public static void main(String[] args) throws IOException {
          readfile();
          writeFile("output.txt", "New text");
	}
	private static void readfile() throws IOException {
		FileReader reader = new FileReader("input.txt");
		
//		BufferedReader bufferedReader = new BufferedReader(reader);
//		String line = bufferedReader.readLine();
//		System.out.println(line);	
		
//		String line;
//		
//		while((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
	}
	

	 private static void writeFile(String file , String data) throws IOException {
	
     	File writer = new File(file);
		FileOutputStream fs = new FileOutputStream(writer);
		
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(fs));
		
		for(int i = 0 ; i < 20 ; i++) {
		bw.write(data + " " + i);
		bw.newLine();
		}
		bw.close();
	
	}
}
