package com.cg.OnlineTermInsurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.OnlineTermInsurance.entity.Admin;
import com.cg.OnlineTermInsurance.exception.UserNotFoundException;
import com.cg.OnlineTermInsurance.repository.AdminRepository;

@Service
public class AdminServiceImpl {

	 @Autowired
	    private AdminRepository adminRepository;
	    public Admin saveAdmin(Admin admin) {
	        String password=admin.getPassword();
	        char c;
	        for(int i=0;i<password.length();i++) {
	            c=(char)(password.charAt(i)+3);
	            password=password.substring(0,i)+c+password.substring(i+1);
	        }
	        admin.setPassword(password);
	        Admin admin1=adminRepository.save(admin);
	        return admin1;
	    }
	    public Admin updateAdmin(Admin admin) {
	        Optional<Admin> admin1=adminRepository.findById(admin.getAdminId());
	        if(admin1.isEmpty()) {
	            throw new UserNotFoundException("There is no user existed with id: "+admin.getAdminId());
	        }
	        Admin admin2=new Admin();
	        return adminRepository.save(admin2);}
	    public int adminLogin(int adminId, String password) {
	        Admin validateAdmin=adminRepository.findByAdminId(adminId);
	        if(validateAdmin==null) {
	            throw new UserNotFoundException("There is no admin with Id: "+adminId);
	        }

	        String pwd=validateAdmin.getPassword();
	        char c;
	        for(int i=0;i<pwd.length();i++) {
	            c=(char)(pwd.charAt(i)-3);
	            pwd=pwd.substring(0,i)+c+pwd.substring(i+1);
	        }
	        if(!pwd.equals(password)) {
	            throw new UserNotFoundException("Invalid Password");
	        }
	        return adminId;
	    }

	 
}
