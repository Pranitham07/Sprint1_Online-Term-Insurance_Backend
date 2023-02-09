package com.cg.OnlineTermInsurance.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.OnlineTermInsurance.dto.LoginDTO;
import com.cg.OnlineTermInsurance.dto.UserDTO;
import com.cg.OnlineTermInsurance.entity.Login;
import com.cg.OnlineTermInsurance.entity.User;
import com.cg.OnlineTermInsurance.exception.UserNotFoundException;
import com.cg.OnlineTermInsurance.repository.UserRepository;
import com.cg.OnlineTermInsurance.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepopsitory;
	
	@Override
	public UserDTO addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		userRepopsitory.save(user);
		return userDTO;

	}

	@Override
	public UserDTO getUserById(int userId) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepopsitory.findById(userId);
		if (user.isPresent()) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(user.get(), dto);
			return dto;
		}
		throw new UserNotFoundException("The user with id "+userId+"does not exists");
	}

	@Override
	public boolean deleteUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		userRepopsitory.delete(user);

		return true;

	}

	@Override
	public UserDTO updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		userRepopsitory.save(user);
		return userDTO;

	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		Iterable<User>list = userRepopsitory.findAll();
		List<UserDTO>dtos = new ArrayList<>();
		for(User user : list) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(user, dto);
			dtos.add(dto);
		}
		return dtos;
	}
	}
	

	


