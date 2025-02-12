package com.example.simple_springboot.model;

import com.example.simple_springboot.model.user;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<user, Integer> {
}
