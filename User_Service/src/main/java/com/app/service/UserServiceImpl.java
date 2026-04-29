package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.dto.DepartmentDTO;
import com.app.dto.ResponseDTO;
import com.app.dto.UserDTO;
import com.app.entity.User;
import com.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
    
	@Autowired
	private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public ResponseDTO getUser(Long userId) {

        ResponseDTO responseDto = new ResponseDTO();
        User user = userRepository.findById(userId).get();
        UserDTO userDto = mapToUser(user);

        ResponseEntity<DepartmentDTO> responseEntity = restTemplate
                .getForEntity("http://department-service/department/" + user.getDepartmentId(),
                DepartmentDTO.class);

        DepartmentDTO departmentDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(userDto);
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }
    
//    public String getDepartment() {
//    	return restTemplate.getForObject(
//    			"http://DEPARTMENT-SERVICE/department", String.class);
//    }

    private UserDTO mapToUser(User user){
        UserDTO userDto = new UserDTO();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}