package com.example.challenge02.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private  String description;
    private Boolean published;
    private Date createdAt;
    private Date updatedAt;

    @OneToMany
    List<User> user;
}
