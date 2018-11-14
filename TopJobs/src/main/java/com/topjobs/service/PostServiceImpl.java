package com.topjobs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.topjobs.model.Post;
import com.topjobs.model.Qualification;
import com.topjobs.repository.PostRepository;
import com.topjobs.repository.QualificationRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	 private PostRepository postRepository;
	
	
	@Override
	public void addPost(Post post) {
		postRepository.save(post);
		
	}
	
	@Bean
	@Override
	public List<Post> getAllPost() {
		List<Post> result = new ArrayList<Post>();
        List<Post> posts = (List<Post>) postRepository.findAll();
        for (Post post : posts) {
            result.add(post);
        }
        return result;
	}

}
