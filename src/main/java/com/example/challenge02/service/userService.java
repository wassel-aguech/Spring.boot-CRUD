package com.example.challenge02.service;

import com.example.challenge02.Entity.User;
import com.example.challenge02.repository.userRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService   {
@Autowired
private userRepos userrepos;


public User getUser(Integer id){
    Optional<User> user = this.userrepos.findById(id);
    return user.orElse(null);

}

public User saveUser(User user){
    return this.userrepos.save(user);
}

public void deleteUser(Integer id){
    this.userrepos.deleteById(id);
}

    public List<User> getALL() {
    return this.userrepos.findAll();
    }
}
