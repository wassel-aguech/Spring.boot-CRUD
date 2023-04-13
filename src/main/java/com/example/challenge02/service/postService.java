package com.example.challenge02.service;

import com.example.challenge02.Entity.Post;
import com.example.challenge02.Entity.User;
import com.example.challenge02.repository.postRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class postService {

    @Autowired
    private postRepos postrepos;

    public Post getPost(Integer id){
        Optional<Post> post = this.postrepos.findById(id);
        return post.orElse(null);

    }
    public Post savePost(Post post){
        return this.postrepos.save(post);
    }

    public void deletePost(Integer id){
        this.postrepos.deleteById(id);
    }

    public List<Post> getALL() {
        return this.postrepos.findAll();
    }


}
