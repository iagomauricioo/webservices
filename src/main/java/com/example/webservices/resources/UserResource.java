package com.example.webservices.resources;

import com.example.webservices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    public ResponseEntity<User> findAll() {
        User user = new User(1, "Iago", "iago@email.com", "8299999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
