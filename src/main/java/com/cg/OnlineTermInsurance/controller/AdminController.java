package com.cg.OnlineTermInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.OnlineTermInsurance.entity.Admin;
import com.cg.OnlineTermInsurance.service.impl.AdminServiceImpl;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	
	    @Autowired
	    
	    AdminServiceImpl adminService;
	    
	    @GetMapping("admin/login/{adminId}/{password}")
        public ResponseEntity<Integer> doLogin(@PathVariable("adminId") int adminId,@PathVariable("password") String password){
	        int admin=adminService.adminLogin(adminId, password);
	        ResponseEntity<Integer> responseEntity=new ResponseEntity<>(admin,HttpStatus.ACCEPTED);
	        return responseEntity;    
	    }
	    @PostMapping
	    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin){
	        Admin admin1=adminService.saveAdmin(admin);
	        ResponseEntity<Admin> responseEntity=new ResponseEntity<>(admin1,HttpStatus.CREATED);
	        return responseEntity;        
	    }
	   
	    @PutMapping
	    public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin){
	        Admin admin1=adminService.saveAdmin(admin);
	        ResponseEntity<Admin> responseEntity=new ResponseEntity<>(admin1,HttpStatus.OK);
	        return responseEntity;        
	    }

	}

