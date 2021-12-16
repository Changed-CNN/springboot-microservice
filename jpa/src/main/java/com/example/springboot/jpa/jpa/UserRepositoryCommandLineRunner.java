package com.example.springboot.jpa.jpa;

import com.example.springboot.jpa.jpa.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User("feng","admin");
        userRepository.save(user);
        log.info("New user is created :"+user);
        Optional<User> userWithIdOne=userRepository.findById(1L);
        log.info("The user is found :"+userWithIdOne);
    }
}
