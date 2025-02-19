package com.example.simple_springboot.model;

import com.example.simple_springboot.model.user;
import com.example.simple_springboot.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	private UserRepo userRepo;

	@Override
}
