package com.manushi.services;

import org.springframework.stereotype.Service;

import com.manushi.model.User;
import com.manushi.UserRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user) {
		
		userRepository.save(user);
	}
	

}
