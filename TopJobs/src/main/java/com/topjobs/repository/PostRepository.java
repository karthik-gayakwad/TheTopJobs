package com.topjobs.repository;

import org.springframework.data.repository.CrudRepository;

import com.topjobs.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
