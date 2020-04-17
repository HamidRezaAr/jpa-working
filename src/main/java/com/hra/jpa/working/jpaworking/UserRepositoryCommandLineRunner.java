package com.hra.jpa.working.jpaworking;

import com.hra.jpa.working.jpaworking.entity.User;
import com.hra.jpa.working.jpaworking.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("Yaas", "Admin");
        userRepository.save(user);
        log.info("New User is created : " + user);
        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("New User is retrieved : " + user);
        List<User> users = userRepository.findAll();
        log.info("All User: " + users );
    }
}

