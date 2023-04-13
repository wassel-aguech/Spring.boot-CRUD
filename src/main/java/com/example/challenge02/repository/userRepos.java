package com.example.challenge02.repository;


import com.example.challenge02.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepos extends JpaRepository<User , Integer> {
}
