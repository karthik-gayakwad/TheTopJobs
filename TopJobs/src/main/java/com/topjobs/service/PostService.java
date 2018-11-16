package com.topjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.topjobs.model.Employer;
import com.topjobs.model.Post;
import com.topjobs.model.Qualification;

public interface PostService {
	
	void addPost(Post post);

	List<Post> getAllPost();
	
	public ResponseEntity<Object> updatePost(String id,Post post);
	
	public void deletePost(Long id);
			
	public Optional<Post> getPost(Long id);
}
