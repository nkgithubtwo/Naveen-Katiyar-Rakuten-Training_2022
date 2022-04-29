package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.model.Tag;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TagRepository;

@RestController
public class PostTagController {

	@Autowired
	TagRepository tagRepository;
	
	@Autowired
	PostRepository postRepository;
	
	@PostMapping("/posts")
	public void savePost(@RequestBody Post post) {
		System.out.println("Post saved");
		post.getTags().addAll(getAllTags());
		postRepository.save(post);
		
	
	}
	
	@PostMapping("/tags")
	public void saveTag(@RequestBody Tag tag) {
		System.out.println("Tag Saved");
		tag.getPosts().addAll(getAllPost());
		tagRepository.save(tag);
	}
	
	@GetMapping("/posts")
		List<Post> getAllPost(){
			return postRepository.findAll();
			}
	
	@GetMapping("/tags")
		List<Tag> getAllTags(){
			return tagRepository.findAll();
		}
}

