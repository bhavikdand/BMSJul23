package com.example.bmsjul23.controllers;

import com.example.bmsjul23.dtos.SignupUserRequestDTO;
import com.example.bmsjul23.dtos.SignupUserResponseDTO;
import com.example.bmsjul23.models.User;
import com.example.bmsjul23.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/signup")
    public SignupUserResponseDTO signupUser(SignupUserRequestDTO requestDTO){
        User user = userService.signupUser(requestDTO.getName(), requestDTO.getEmail(), requestDTO.getPassword());
        return SignupUserResponseDTO.getSuccessDTO(user);
    }

    @RequestMapping(path = "/signup_phone")
    public SignupUserResponseDTO signupUserPhone(SignupUserRequestDTO requestDTO){
        User user = userService.signupUser(requestDTO.getName(), requestDTO.getEmail(), requestDTO.getPassword());
        return SignupUserResponseDTO.getSuccessDTO(user);
    }
}
