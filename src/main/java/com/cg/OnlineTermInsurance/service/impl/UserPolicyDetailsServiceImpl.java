package com.cg.OnlineTermInsurance.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.OnlineTermInsurance.dto.PolicyDTO;
import com.cg.OnlineTermInsurance.dto.UserPolicyDetailsDTO;
import com.cg.OnlineTermInsurance.entity.Policy;
import com.cg.OnlineTermInsurance.entity.UserPolicyDetails;
import com.cg.OnlineTermInsurance.exception.PolicyNotFoundException;
import com.cg.OnlineTermInsurance.exception.UserPolicyDetailsNotFoundException;
import com.cg.OnlineTermInsurance.repository.UserPolicyDetailsRepository;
import com.cg.OnlineTermInsurance.service.UserPolicyDetailsService;

 

@Service
public class UserPolicyDetailsServiceImpl implements UserPolicyDetailsService {

 

    @Autowired
    private UserPolicyDetailsRepository repository;
    @Override
      public UserPolicyDetailsDTO saveUserPolicyDetails(UserPolicyDetailsDTO userpolicydetailsdto) {
        // TODO Auto-generated method stub
        UserPolicyDetails userPolicydetails = new UserPolicyDetails();
        BeanUtils.copyProperties(userpolicydetailsdto, userPolicydetails);
        repository.save(userPolicydetails);
        return userpolicydetailsdto;
    }
    @Override
    public boolean deleteUserPolicyDetails(UserPolicyDetailsDTO userpolicydetailsdto) {
        // TODO Auto-generated method stub
        UserPolicyDetails userPolicydetails = new UserPolicyDetails();
        BeanUtils.copyProperties(userpolicydetailsdto, userPolicydetails);
        repository.delete(userPolicydetails);
        return true;
    }
    @Override
    public List<UserPolicyDetailsDTO> getAllUserPolicies() {
        // TODO Auto-generated method stub
    	Iterable<UserPolicyDetails>list = repository.findAll();
    	List<UserPolicyDetailsDTO>dtos=new ArrayList<>();
    	for(UserPolicyDetails userpolicydetails:list) {
    		UserPolicyDetailsDTO dto = new UserPolicyDetailsDTO();
    		BeanUtils.copyProperties(userpolicydetails, dto);
    		dtos.add(dto);
    	}
    	return dtos;
    }
    @Override
    public UserPolicyDetailsDTO findByUserId(int id) {
       Optional<UserPolicyDetails> userpolicydetails = repository.findById(id);
       if(userpolicydetails.isPresent()) {
    	   //Convert the entity to DTO
    	   UserPolicyDetailsDTO dto = new UserPolicyDetailsDTO();
    	   BeanUtils.copyProperties(userpolicydetails.get(), dto);
    	   return dto;
       }
        throw new UserPolicyDetailsNotFoundException("The user with id "+id+"does not exists");
    }
    @Override
    public UserPolicyDetailsDTO update(UserPolicyDetailsDTO userpolicydetailsdto) {
        // TODO Auto-generated method stub
        UserPolicyDetails userPolicyDetails = new UserPolicyDetails();
        BeanUtils.copyProperties(userpolicydetailsdto, userPolicyDetails);
        repository.save(userPolicyDetails);
        return userpolicydetailsdto;
    }
	@Override
	public UserPolicyDetailsDTO getById(int id) {
		Optional<UserPolicyDetails> userpolicydetails =repository.findById(id);
		if(userpolicydetails.isPresent()) {
			//Convert the entity to DTO
			UserPolicyDetailsDTO dto=new UserPolicyDetailsDTO();
			BeanUtils.copyProperties(userpolicydetails.get(), dto);
			return dto;	
		}
		throw new UserPolicyDetailsNotFoundException("The user with id "+id+"does not exists");
	}
	
 

}
 