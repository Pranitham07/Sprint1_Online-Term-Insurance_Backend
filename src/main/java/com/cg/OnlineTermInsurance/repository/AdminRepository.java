package com.cg.OnlineTermInsurance.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cg.OnlineTermInsurance.entity.Admin;

public interface AdminRepository  extends CrudRepository<Admin, Integer>{

 

    Admin save(Admin admin);

 

    Optional<Admin> findById(int adminId);

 

    Admin findByAdminId(int adminId);

 

}
