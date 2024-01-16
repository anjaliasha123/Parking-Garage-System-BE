package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.User;

public interface UserService {
    User getUserById(Long id);
    User loginUser(String email);
    User registerUser(User user);
}
