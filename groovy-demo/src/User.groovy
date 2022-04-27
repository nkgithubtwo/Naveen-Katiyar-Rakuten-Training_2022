import java.io.File
class User {
	static void main(String[] args) {
		new File("Example.txt").eachLine {line ->
			println "line : $line";
		}

		File file1 = new File("Example.txt")
		println "The file ${file1.absolutePath} has ${file1.length()} bytes"

		def file2 = new File("Example.txt")
		println "file? ${file2.isFile()}"
		println "Directory? ${file2.isDirectory()}"

   }
}
