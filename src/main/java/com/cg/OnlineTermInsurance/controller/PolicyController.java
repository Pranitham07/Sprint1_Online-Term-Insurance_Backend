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


import com.cg.OnlineTermInsurance.dto.PolicyDTO;
import com.cg.OnlineTermInsurance.exception.PolicyNotFoundException;
import com.cg.OnlineTermInsurance.service.PolicyService;


@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/policy")
public class PolicyController {

	@Autowired
	private PolicyService policyService;
	
	@PostMapping
	public ResponseEntity<PolicyDTO> savePolicy(@Valid @RequestBody PolicyDTO policyDTO) {
		PolicyDTO policy = policyService.savePolicy(policyDTO);
		return ResponseEntity.ok(policy);

	}
	@PutMapping("/{policyId}")
	public ResponseEntity<PolicyDTO> updatePolicy(@RequestBody PolicyDTO dto) {
		return new ResponseEntity<PolicyDTO>(policyService.updatePolicy(dto), HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/deletepolicy/{id}")
	public ResponseEntity<Boolean>deletePolicyById(@PathVariable Integer id){
		PolicyDTO policyDTO=policyService.getById(id);
		if(policyDTO != null) {
			policyService.deletePolicy(policyDTO);
			return new ResponseEntity<Boolean>(true,HttpStatus.ACCEPTED);
		}
		throw new PolicyNotFoundException("Policy with id" +id+"does not exists");	
	}
	@GetMapping("/allpolicies")
	public ResponseEntity<List<PolicyDTO>> getAllPolicyDetails(){
		List<PolicyDTO> list=policyService.viewAllPolicyDetails();
		return ResponseEntity.ok(list);
	}
	
}
