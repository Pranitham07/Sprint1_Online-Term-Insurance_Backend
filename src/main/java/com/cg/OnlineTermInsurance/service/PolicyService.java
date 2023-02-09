package com.cg.OnlineTermInsurance.service;

import java.util.List;

import com.cg.OnlineTermInsurance.dto.PolicyDTO;

import com.cg.OnlineTermInsurance.entity.Policy;
import com.cg.OnlineTermInsurance.exception.ResourceNotFoundException;

public interface PolicyService {

	public PolicyDTO savePolicy(PolicyDTO policyDTO);
	public boolean deletePolicy(PolicyDTO policyDTO);
	public PolicyDTO updatePolicy(PolicyDTO policyDTO);
    public List<PolicyDTO> viewAllPolicyDetails();
	public PolicyDTO getById(Integer id);
	

	
	

	 

	}

