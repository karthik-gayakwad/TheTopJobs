package com.topjobs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.model.Employer;
import com.topjobs.model.Post;

import com.topjobs.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	// List All
	@RequestMapping("/api/posts")
	public List<Post> getAllPost() {
		return postService.getAllPost();
	}

	// Update
	@RequestMapping(method = RequestMethod.PUT, value = "/api/post_update/{id}")
	public void update(@PathVariable String id, @RequestBody Post post) {
		postService.updatePost(id, post);
	}

	// Delete
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/post_delete/{id}")
	public void delete(@PathVariable String id) {
		postService.deletePost(Long.parseLong(id));
	}

	// Get by ID
	@RequestMapping(method = RequestMethod.GET, value = "/getpost/{id}")
	public Optional<Post> getPost(@PathVariable Long id) {
		return postService.getPost(id);
	}

	// Add
	@RequestMapping(method = RequestMethod.POST, value = "/api/addpost")
	public Post addPost(@RequestBody Post post) {
		System.out.println(post);
		postService.addPost(post);
		return post;
	}
}
