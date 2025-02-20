package com.example.simple_springboot.model;

import com.example.simple_springboot.model.user;
import com.example.simple_springboot.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	private UserRepo userRepo;

	@Override
	public List<user> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void save(user User) {
		userRepo.save(User);
	}

	@Override
	public user getById(Integer id) {
		Optional<user> optional = userRepo.findById(id);
		user User = null;
		if (optional.isPresent()) {
			User = optional.get();
		} else {
			throw new RuntimeException("User not found for id: " + id);
		}
		return User;
	}

	@Override
	public void deleteViaId(Integer id) {
		userRepo.deleteById(id);
	}

}
