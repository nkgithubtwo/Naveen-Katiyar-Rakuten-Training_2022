
class List {
	
	static void main(String[] args) {
		def list = [11,23,34,2];
		
		println(list);
		
		list.add(10)
		println(list);
		
		list.add(1,1);
		println(list);
		
		println(list.contains(35));
	    println(list.get(3));
		println(list.isEmpty());
		println(list.minus(24));
		
		println(list.pop());
		println(list);
		
		println(list.remove(1));
		println(list);
		
		println(list.reverse());
		
	}
}
