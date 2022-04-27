import java.io.File
class FindAsolutePath {
	static void main(String[] args) {
		
	new File('Temp').eachFileRecurse(){
		file -> println file.getAbsolutePath()
   }   
}
}
