package com.example.challenge02.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.jdbc.Size;

import java.util.List;

@Entity
@Table(name = "user_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String pasword;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;


    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user-id"),
            inverseJoinColumns = @JoinColumn(name = "role-id"))
    List<Role> role;


    @OneToOne
    private UserDetails userdetails;
}
