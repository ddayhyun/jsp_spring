package com.example.jsp_spring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsp_spring.user.dao.UserMapper;
import com.example.jsp_spring.user.domain.UserRequestDTO;
import com.example.jsp_spring.user.domain.UserResponseDTO;

@Service
public class UserService {

    
    @Autowired
    private UserMapper userMapper;

    public UserResponseDTO login(UserRequestDTO params) {
        System.out.println("debug >>> UserService login");
        return userMapper.loginRow(params);
    }
}
