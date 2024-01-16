package com.anjali.springboot.parkinggarage.services;

import com.anjali.springboot.parkinggarage.models.User;
import com.anjali.springboot.parkinggarage.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserById(Long id) {
        User user = this.userRepository.findById(id).get();
        return user;
    }

    @Override
    public User loginUser(String email) {
        User user = this.userRepository.findByEmail(email).get();
        return user;
    }

    @Override
    public User registerUser(User user) {
        return this.userRepository.save(user);
    }
}
