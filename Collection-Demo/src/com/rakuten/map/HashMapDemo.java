package com.rakuten.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Book> books = new HashMap<>();
		
		Book book = new Book();
		book.setTitle("title"+1);
		books.put("key1", book);
		
		Book book1 = new Book();
		book1.setTitle("book"+1);
		if(books.containsKey("Key1"));
		books.put("key1" ,book1);
		
//		for(int i = 0; i< 100 ; i++) {
//			Book book = new Book();
//			book.setTitle("title" + i);
//			book.setPrice((float)Math.random()*1000);
//			books.put(" key"+1, book);
//		}
		
		System.out.println(books);
	}

}
