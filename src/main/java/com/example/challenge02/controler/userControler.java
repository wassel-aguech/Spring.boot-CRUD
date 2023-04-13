package com.example.challenge02.controler;

import com.example.challenge02.Entity.User;
import com.example.challenge02.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class userControler {

@Autowired
    private userService userservice;

    @GetMapping("/getuser/{id}")
    public User getuser(@PathVariable Integer id){
        return userservice.getUser(id);
    }

    @PostMapping("/saveuser")
    public User saveuser(@RequestBody User user){
        return userservice.saveUser(user);
    }
    @PostMapping("/updateuser")
    public User updateuser(@RequestBody User user){
        return userservice.saveUser(user);
    }
    @DeleteMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable Integer id){
         userservice.deleteUser(id);
    }
    @GetMapping("/getalluser")
    public List<User> getalluser(){
        return userservice.getALL();
    }
}
