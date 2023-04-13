package com.example.challenge02.repository;

import com.example.challenge02.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepos extends JpaRepository<Role , Integer> {
}
