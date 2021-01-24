package com.example.springmvc.service;

import com.example.springmvc.model.Login;
import com.example.springmvc.model.User;

public interface UserService {

    void addUser(User user);

    User validateUser(Login login);
}
