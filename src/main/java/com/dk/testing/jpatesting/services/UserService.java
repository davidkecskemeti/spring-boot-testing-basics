package com.dk.testing.jpatesting.services;

import com.dk.testing.jpatesting.entities.UserEntity;
import com.dk.testing.jpatesting.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserEntity> findAll() {
        return repository.findAll();
    }
}
