package com.example.challenge02.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String githubProfileLink;
    private String linkedinProfileLink;
    private Date createdAt;
    private Date updatedAt;


    @OneToOne
    @JoinColumn(name = "user-id")
    private User user;

}
