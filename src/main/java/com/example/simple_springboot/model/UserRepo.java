package com.example.simple_springboot.model;

import com.example.simple_springboot.model.user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<user, Integer> {
}
