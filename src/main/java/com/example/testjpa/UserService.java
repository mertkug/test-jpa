package com.example.testjpa;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users getUser(Users user) {
        return user;
    }

    public void saveUser(Users user) {
        userRepository.save(user);
    }
}
