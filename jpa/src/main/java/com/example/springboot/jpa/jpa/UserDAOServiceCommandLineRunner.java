package com.example.springboot.jpa.jpa;

import com.example.springboot.jpa.jpa.entity.User;
import com.example.springboot.jpa.jpa.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService userDAOService;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("melo","admin");
        long insert = userDAOService.insert(user);
        log.info("New user is created :"+user);
    }
}
