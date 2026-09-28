package com.medical.medical_service_platform.service;


import java.util.List;

import com.medical.medical_service_platform.model.User;

public interface UserService {

    User registerUser(User user);

    List<User> getAllUsers();
}