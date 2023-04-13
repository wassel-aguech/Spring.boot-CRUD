package com.example.challenge02.controler;

import com.example.challenge02.Entity.Post;
import com.example.challenge02.Entity.User;
import com.example.challenge02.reponses.MessageResponse;
import com.example.challenge02.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class postControler {

    @Autowired
    private postService postservice;

    @GetMapping("/getpost/{id}")
    public Post getpost(@PathVariable Integer id){
        return postservice.getPost(id);
    }
    @PostMapping("/savepost")
    public Post savepost(@RequestBody Post post){
        return postservice.savePost(post);

    }
    @PostMapping ("/updatepost")
    public Post updatepost(@RequestBody Post post){
        return postservice.savePost(post);
    }
    @DeleteMapping("/deletepost/{id}")
    public void deletepost(@PathVariable Integer id){
        postservice.deletePost(id);
    }
    @GetMapping("/getallpost")
    public List<Post> getallpost(){
        return postservice.getALL();
    }
}
