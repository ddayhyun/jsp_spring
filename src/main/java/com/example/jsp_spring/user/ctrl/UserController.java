package com.example.jsp_spring.user.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jsp_spring.user.domain.UserRequestDTO;
import com.example.jsp_spring.user.domain.UserResponseDTO;
import com.example.jsp_spring.user.service.UserService;

import jakarta.servlet.http.HttpSession;

// user endpoint : http://localhost:7777/user
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService UserService;

    // http://localhost:7777/user/login.multicampus
    @PostMapping("/login.multicampus")
    public String login(UserRequestDTO params, HttpSession session) {

        System.out.println("debug >>> IndexController user endpoint : /user/login.multicampus");
        System.out.println("debug >>> params : " + params);
        UserResponseDTO result = UserService.login(params);
        System.out.println("debug >>> result : " + result);

        if(result != null){
            // jsp 상태관리 (트래킹 매커니즘) - request(포워드되는 페이지까지만), session(모든 페이지)
            session.setAttribute("loginUser", result);
            return "landing";
        } else {
            return "index";
        }
    }
    
}
