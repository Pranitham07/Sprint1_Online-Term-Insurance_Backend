package com.cg.OnlineTermInsurance.service;
import java.util.List;




import com.cg.OnlineTermInsurance.dto.UserPolicyDetailsDTO;

 

public interface UserPolicyDetailsService {

    public boolean deleteUserPolicyDetails(UserPolicyDetailsDTO userpolicydetailsdto);
    public UserPolicyDetailsDTO update(UserPolicyDetailsDTO userpolicydetailsdto);
    public List<UserPolicyDetailsDTO> getAllUserPolicies();
    public UserPolicyDetailsDTO findByUserId(int id);
    UserPolicyDetailsDTO saveUserPolicyDetails(UserPolicyDetailsDTO userpolicydetailsdto);
	public UserPolicyDetailsDTO getById(int id);
} 
