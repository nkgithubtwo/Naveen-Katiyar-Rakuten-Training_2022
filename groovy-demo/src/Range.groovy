
class Range {

	static void main(String[] args) {
		def range = 'z'..'f';


		for(int i = 0 ; i < range.size() ; i++) {
			print(range[i] + " ")
		}

		println(range.contains(2))
	}
}
