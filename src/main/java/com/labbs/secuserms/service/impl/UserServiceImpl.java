package com.labbs.secuserms.service.impl;

import com.labbs.secuserms.model.User;
import com.labbs.secuserms.repository.UserRepository;
import com.labbs.secuserms.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
