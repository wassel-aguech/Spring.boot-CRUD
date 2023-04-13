package com.example.challenge02.controler;

import com.example.challenge02.Entity.UserDetails;
import com.example.challenge02.service.userDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class userdetailsControler {
    @Autowired
    private userDetailsService userdetailsservice;

    @GetMapping("/getuserdetails/{id}")
    public UserDetails getuserdetails(@PathVariable Integer id){
        return userdetailsservice.getUserDetails(id);
    }

    @GetMapping("/getalluserdetails")
    public List<UserDetails> getall(){
        return userdetailsservice.getAllUserDetails();
    }
    @PostMapping("/saveuserdetails")
    public UserDetails saveuserdetails(@RequestBody UserDetails userdetails){
        return  userdetailsservice.saveUserDetails(userdetails);
    }
    @PostMapping("/updateuserdetails")
    public UserDetails updateerdetails(@RequestBody UserDetails userdetails){
        return  userdetailsservice.saveUserDetails(userdetails);
    }

    @DeleteMapping("/deleteuserdetails/{id}")
    public  void deleteuserdetails(@PathVariable Integer id){
        userdetailsservice.deleteUserDetails(id);
    }


}
