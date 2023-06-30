package com.example.javatestdto.service;

import com.example.javatestdto.model.User;
import com.example.javatestdto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return this.userRepository.findById(userId).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
       this.userRepository.deleteById(userId);
    }
}
