package com.abc.demoSpringBoot.Services;

import com.abc.demoSpringBoot.Entity.Post;
import com.abc.demoSpringBoot.Repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts(){
        return postRepository.findAll();
    }
}
