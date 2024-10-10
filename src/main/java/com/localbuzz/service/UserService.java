package com.localbuzz.service;

import com.localbuzz.model.User;
import com.localbuzz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository testrepo;

    public void addBusiness() {
        User test_user = new User();
        test_user.setEmail("akbah@gmail.com");  // Corrected setter method usage
        test_user.setPassword("aaa");
        testrepo.save(test_user);
    }
}

