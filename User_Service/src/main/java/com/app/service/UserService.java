package com.app.service;

import com.app.dto.ResponseDTO;
import com.app.entity.User;

public interface UserService {
	
	User saveUser(User user);
	
	ResponseDTO getUser(Long userId);
}
