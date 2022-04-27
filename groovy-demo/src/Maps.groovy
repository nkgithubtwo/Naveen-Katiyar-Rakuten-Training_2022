
class Maps {
	
	static void main(String[] args) {
		def map1 = ['Model' : 'Realme' , 'Price' : '1000$'];
		println(map1);
		
    println(map1.containsKey('Model'))
	println(map1.get('Price'))
	println(map1.keySet());
	println(map1.put('RAM', '8GB'));
	println(map1);
	println(map1.size());
	println(map1.values())
		
	}
}

