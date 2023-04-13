package com.example.challenge02.service;

import com.example.challenge02.Entity.Post;
import com.example.challenge02.Entity.Role;
import com.example.challenge02.repository.roleRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class roleService {

    @Autowired
    private roleRepos rolerepos;

 public Role getRole(Integer id){
     Optional<Role> role = this.rolerepos.findById(id);
     return role.orElse(null);
    }

    public Role saveRole (Role role){
     return this.rolerepos.save(role);
    }

    public void deleteRole(Integer id){
      this.rolerepos.deleteById(id);
    }

    public List<Role> getALL(){
     return this.rolerepos.findAll();
    }


}
