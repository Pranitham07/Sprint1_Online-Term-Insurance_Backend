package com.cg.OnlineTermInsurance.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.OnlineTermInsurance.dto.LoginDTO;
import com.cg.OnlineTermInsurance.dto.UserDTO;
import com.cg.OnlineTermInsurance.exception.UserNotFoundException;
import com.cg.OnlineTermInsurance.service.UserService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	//http://localhost:9091/api/users
	@PostMapping
	public ResponseEntity<UserDTO> addUser(@Valid @RequestBody UserDTO userDTO) {

		UserDTO user = userService.addUser(userDTO);
		return ResponseEntity.ok(user);

	}
	@GetMapping("/{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable int userId) {
		UserDTO dto = userService.getUserById(userId);
		return ResponseEntity.ok(dto);
	}
	@GetMapping
	public ResponseEntity<List<UserDTO>> getAllUsers() {
		List<UserDTO>list = userService.getAllUsers();
		return ResponseEntity.ok(list);
	}
	@DeleteMapping("/{userId}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable int userId) {
		UserDTO dto = userService.getUserById(userId);
		if (dto != null) {
			return new ResponseEntity<Boolean>(userService.deleteUser(dto), HttpStatus.OK);
		}
		throw new UserNotFoundException("user with id" + userId + "doesn't exist");

	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDTO>updateUser(@RequestBody UserDTO dto) {
		return new ResponseEntity<UserDTO>(userService.updateUser(dto),HttpStatus.ACCEPTED);
	}
}
	

