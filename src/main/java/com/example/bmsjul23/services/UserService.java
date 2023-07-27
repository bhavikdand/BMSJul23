package com.example.bmsjul23.services;

import com.example.bmsjul23.models.User;
import com.example.bmsjul23.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signupUser(String name, String email, String password){
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));
        return userRepository.save(user);
    }


    public boolean login(String email, String password){
        User user = userRepository.findByEmail(email);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(password, user.getPassword())){
            // we will let the use login
            return true;
        } else {
            // incorrect password
            return false;
        }
    }
}
