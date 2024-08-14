package com.project.spring_rest_api.jpa;

import com.project.spring_rest_api.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
