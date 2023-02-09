package com.cg.OnlineTermInsurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.OnlineTermInsurance.entity.Login;
import com.cg.OnlineTermInsurance.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{


	void save(Login login);

}

