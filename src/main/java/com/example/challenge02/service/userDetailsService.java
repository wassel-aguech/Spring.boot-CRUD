package com.example.challenge02.service;

import com.example.challenge02.Entity.UserDetails;
import com.example.challenge02.repository.userDetailsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userDetailsService {

    @Autowired
    private userDetailsRepos userdetailsrepos;

    public UserDetails getUserDetails(Integer id){
        Optional<UserDetails> userdetails = this.userdetailsrepos.findById(id);
        return userdetails.orElse(null);
    }

    public UserDetails saveUserDetails(UserDetails userdetails){
        return this.userdetailsrepos.save(userdetails);
    }

    public void deleteUserDetails(Integer id){
        userdetailsrepos.deleteById(id);
    }

    public List<UserDetails> getAllUserDetails(){
        return this.userdetailsrepos.findAll();
    }
}
