package com.example.challenge02.controler;

import com.example.challenge02.Entity.Post;
import com.example.challenge02.Entity.Role;
import com.example.challenge02.service.roleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class roleControler {

    @Autowired
    private roleService roleservice;


    @GetMapping("/getrole/{id}")
    public Role getrole(@PathVariable Integer id){
        return roleservice.getRole(id);
    }
    @PostMapping("/saverole")
    public Role saverole(@RequestBody Role role){
        return roleservice.saveRole(role);
    }

    @PostMapping("/updaterole")
    public Role updaterole(@RequestBody Role role){
        return roleservice.saveRole(role);
    }

    @DeleteMapping("/deleterole{id}")
    public void deleterole(@PathVariable Integer id){
         roleservice.deleteRole(id);
    }

    @GetMapping("/getallrole")
    public List<Role> getallrole(){
        return roleservice.getALL();
    }


}
