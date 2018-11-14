package com.topjobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.model.Post;

import com.topjobs.service.PostService;

@RestController
public class PostController {
	

	@Autowired
	private PostService postService;
	
	@RequestMapping("/api/posts")
	public List<Post> getAllPost(){
		return postService.getAllPost();
	}
}
