package com.hra.jpa.working.jpaworking;

import com.hra.jpa.working.jpaworking.entity.User;
import com.hra.jpa.working.jpaworking.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService userDaoService;
    @Override
    public void run(String... arg0) throws Exception {
        User user = new User("Aram", "Admin");
        //New User is created : User [id=1, name=Aram, role=Admin]
        long insert = userDaoService.insert(user);
        log.info("New User is created : " + user);
    }
}

