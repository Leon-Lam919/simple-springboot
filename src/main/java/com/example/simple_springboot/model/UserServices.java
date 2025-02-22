package com.example.simple_springboot.model;

import java.util.List;
import com.example.simple_springboot.model.User;

public interface UserServices {
	List<User> getAllUsers();

	void save(User User);

	User getById(Integer id);

	void deleteViaId(Integer id);

}
