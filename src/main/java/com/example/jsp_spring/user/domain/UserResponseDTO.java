package com.example.jsp_spring.user.domain;

import lombok.Data;

@Data
public class UserResponseDTO {
    private String id;
    private String pwd;
    private String name;
    private Integer point;
    private String imgUrl;
}