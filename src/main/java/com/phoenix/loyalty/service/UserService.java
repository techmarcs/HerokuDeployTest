package com.phoenix.loyalty.service;

import com.phoenix.loyalty.model.User;


public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
