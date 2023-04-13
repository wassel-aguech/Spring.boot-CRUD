package com.example.challenge02.repository;

import com.example.challenge02.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userDetailsRepos extends JpaRepository<UserDetails , Integer> {
}
