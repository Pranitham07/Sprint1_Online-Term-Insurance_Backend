package com.cg.OnlineTermInsurance.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.cg.OnlineTermInsurance.dto.UserPolicyDetailsDTO;
import com.cg.OnlineTermInsurance.exception.UserPolicyDetailsNotFoundException;
import com.cg.OnlineTermInsurance.service.UserPolicyDetailsService;

 

@RestController
@RequestMapping("/api/UserPolicy")
public class UserPolicyDetailsController {
    @Autowired
    private UserPolicyDetailsService userpolicydetailsService;
    //http://localhost:9091/api/userpolicy
    @PostMapping("/userpolicy")
    public UserPolicyDetailsDTO saveUserPolicyDetails(@RequestBody UserPolicyDetailsDTO userpolicydetailsDTO) {
        userpolicydetailsService.saveUserPolicyDetails(userpolicydetailsDTO);
        return userpolicydetailsDTO;
    }
    @PutMapping("/updateuserpolicydetails")
    public ResponseEntity<UserPolicyDetailsDTO> updateUserPolicyDetails(@RequestBody UserPolicyDetailsDTO userpolicydetailsDTO){
        return new ResponseEntity<UserPolicyDetailsDTO>(userpolicydetailsService.update(userpolicydetailsDTO),HttpStatus.ACCEPTED);
    }
    @GetMapping("/getAllUserPolicies")
    public ResponseEntity<List<UserPolicyDetailsDTO>>getAllUserPolicies(){
    	List<UserPolicyDetailsDTO> list=userpolicydetailsService.getAllUserPolicies();
    	return ResponseEntity.ok(list);
    }
    @DeleteMapping("/deleteUserPolicydetails")
    public ResponseEntity<Boolean>deleteUserPolicyDetails(@PathVariable int id){
    	UserPolicyDetailsDTO userpolicydetailsDTO=userpolicydetailsService.getById(id);
    	if(userpolicydetailsDTO != null) {
    		userpolicydetailsService.deleteUserPolicyDetails(userpolicydetailsDTO);
    		return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);	
    	}
    	throw new UserPolicyDetailsNotFoundException("user with id"+id+"does not exists");
    }
}