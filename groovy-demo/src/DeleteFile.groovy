import java.io.File

class DeleteFile {

	static void main(String[] args) {

		def fileDelete = new File('NewFile1.txt');
		fileDelete.delete();
	}
}
