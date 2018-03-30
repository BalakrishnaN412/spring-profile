package com.javatechie.spring.profile.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.javatechie.spring.profile.api.dao.UserRepository;
import com.javatechie.spring.profile.api.model.User;

@Service
@Profile(value = { "local", "dev", "prod" })
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> getUsers() {
		return repository.findAll();
	}

}
