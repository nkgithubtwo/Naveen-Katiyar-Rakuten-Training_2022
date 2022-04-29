package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Post;
import com.example.demo.model.Tag;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TagRepository;

@SpringBootApplication
public class JpaManyToManyDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyDemo1Application.class, args);
	}
	


}
