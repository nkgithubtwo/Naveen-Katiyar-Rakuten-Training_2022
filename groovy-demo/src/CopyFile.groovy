
class CopyFile {
	static void main(String[] args) {
		def src = new File("Source.txt")
	    def dst = new File("Destination.txt")
		
		dst << src.text
	}
}
