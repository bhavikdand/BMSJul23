package com.example.bmsjul23;

import com.example.bmsjul23.controllers.TicketController;
import com.example.bmsjul23.controllers.UserController;
import com.example.bmsjul23.dtos.SignupUserRequestDTO;
import com.example.bmsjul23.models.City;
import com.example.bmsjul23.models.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmsJul23Application implements CommandLineRunner {

    private UserController userController;
    private TicketController ticketController;

    @Autowired
    public BmsJul23Application(UserController userController) {
        this.userController = userController;
    }

    public static void main(String[] args) {
        SpringApplication.run(BmsJul23Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting to insert user");
        SignupUserRequestDTO dto = new SignupUserRequestDTO();
        dto.setEmail("john@doe.com");
        dto.setPassword("password");
        dto.setName("John");
        userController.signupUser(dto);
        System.out.println("User has been inserted");


    }
}
