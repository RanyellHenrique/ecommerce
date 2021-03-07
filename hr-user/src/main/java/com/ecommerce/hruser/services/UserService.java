package com.ecommerce.hruser.services;

import com.ecommerce.hruser.entities.User;
import com.ecommerce.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        User user = obj.orElseThrow(() -> new RuntimeException("Entity not found"));
        return user;
    }

    public User findByEmail(String email) {
        User user = repository.findByEmail(email);
        return user;
    }
}
