package com.example.simple_springboot.model;

import java.util.List;
import com.example.simple_springboot.model.user;

public interface UserServices {
	List<user> getAllUsers();

	void save(user User);

	user getById(Integer id);

	void deleteViaId(Integer id);

}
