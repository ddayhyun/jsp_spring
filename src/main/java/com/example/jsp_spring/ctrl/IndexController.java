package com.example.jsp_spring.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class IndexController {
    /*
     필요에 따라서 메서드가 파라미터값을 전달 받을 때
     @PathVariable
     @RequestParam
     XXXXDTO
     */
    @GetMapping("/index.multicampus")
    public String index() {
        System.out.println("debug >>> IndexController user endpoint : /index.multicampus");
        return "index";
    }
     @GetMapping("/")
    public String index(HttpSession session) {
        System.out.println("debug >>> IndexContorller user endpoint : /");
        if(session.getAttribute("loginUser") != null){
            return "landing";
        }
        return "index";
    }
    
}
