package com.cg.OnlineTermInsurance.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.OnlineTermInsurance.dto.LoginDTO;
import com.cg.OnlineTermInsurance.dto.UserDTO;
import com.cg.OnlineTermInsurance.entity.User;

public interface UserService {

	

	public UserDTO addUser(UserDTO userDTO);
	public UserDTO updateUser(UserDTO userDTO);
	public boolean deleteUser(UserDTO userDTO);
	public UserDTO getUserById(int userId);
	public List<UserDTO> getAllUsers();
	
	
	
}
