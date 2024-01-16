package com.anjali.springboot.parkinggarage.controllers;

import com.anjali.springboot.parkinggarage.models.User;
import com.anjali.springboot.parkinggarage.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/parking/users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
        User user = this.userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<User> loginUserCredentials(@RequestParam("emailId") String email){
        User user = this.userService.loginUser(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user){
        User registerdUser = this.userService.registerUser(user);
        return new ResponseEntity<>(registerdUser, HttpStatus.OK);
    }
}
