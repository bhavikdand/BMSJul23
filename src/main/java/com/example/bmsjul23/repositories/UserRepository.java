package com.example.bmsjul23.repositories;

import com.example.bmsjul23.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User save(User user);

    User findByEmail(String email);
}
