package com.example.springmvc.service;

import com.example.springmvc.model.Login;
import com.example.springmvc.model.User;
import com.example.springmvc.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
           userRepository.save(user);
    }

    @Override
    public User validateUser(Login login) {
        return userRepository.findByUsername(login.getUsername());
    }
}
