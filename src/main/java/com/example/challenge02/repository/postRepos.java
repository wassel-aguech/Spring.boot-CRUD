package com.example.challenge02.repository;

import com.example.challenge02.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepos extends JpaRepository<Post , Integer> {
}
