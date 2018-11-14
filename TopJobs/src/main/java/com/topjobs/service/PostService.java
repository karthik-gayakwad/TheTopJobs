package com.topjobs.service;

import java.util.List;

import com.topjobs.model.Post;
import com.topjobs.model.Qualification;

public interface PostService {
	void addPost(Post post);

	List<Post> getAllPost();
}
