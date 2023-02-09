package com.cg.OnlineTermInsurance.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;


import com.cg.OnlineTermInsurance.dto.PolicyDTO;
import com.cg.OnlineTermInsurance.dto.UserDTO;

import com.cg.OnlineTermInsurance.entity.Policy;
import com.cg.OnlineTermInsurance.entity.User;
import com.cg.OnlineTermInsurance.exception.PolicyNotFoundException;
import com.cg.OnlineTermInsurance.repository.PolicyRepository;
import com.cg.OnlineTermInsurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService{

	
	
	@Autowired
	private PolicyRepository repository;
	@Override
	public PolicyDTO savePolicy(PolicyDTO policyDTO) {
		// TODO Auto-generated method stub
		Policy policy = new Policy();
		BeanUtils.copyProperties(policyDTO, policy);
		repository.save(policy);
		return policyDTO;
	}
	@Override
	public PolicyDTO updatePolicy(PolicyDTO policyDTO) {
		// TODO Auto-generated method stub
		Policy policy=new Policy();
		BeanUtils.copyProperties(policyDTO, policy);
		repository.save(policy);
		return policyDTO;
	}
	@Override
	public boolean deletePolicy(PolicyDTO policyDTO) {
		// TODO Auto-generated method stub
		Policy policy=new Policy();
		BeanUtils.copyProperties(policyDTO, policy);
		repository.delete(policy);
		return true;

	}
	@Override
	public List<PolicyDTO> viewAllPolicyDetails() {
		// TODO Auto-generated method stub
		Iterable<Policy>list = repository.findAll();
		List<PolicyDTO>dtos=new ArrayList<>();
		for(Policy policy:list) {
			PolicyDTO dto= new PolicyDTO();
			BeanUtils.copyProperties(policy, dto);
			dtos.add(dto);
		}
		return dtos;
	}
	@Override
	public PolicyDTO getById(Integer id) {
		Optional<Policy> policy=repository.findById(id);
		if(policy.isPresent()) {
			//Convert entity to DTO
			PolicyDTO dto = new PolicyDTO();
			BeanUtils.copyProperties(policy.get(), dto);
			return dto;
		}
		throw new PolicyNotFoundException("The user with id " +id+ "does not exists");
	}
	
	
}
