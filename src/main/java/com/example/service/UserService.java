package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    int save(User user);

    List<User> findBaAll();
}
