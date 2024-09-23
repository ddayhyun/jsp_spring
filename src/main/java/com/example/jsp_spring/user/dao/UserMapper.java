package com.example.jsp_spring.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.jsp_spring.user.domain.UserRequestDTO;
import com.example.jsp_spring.user.domain.UserResponseDTO;

@Mapper
public interface UserMapper {
    public UserResponseDTO loginRow(UserRequestDTO params);
}
