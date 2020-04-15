package com.hra.jpa.working.jpaworking.service;

import com.hra.jpa.working.jpaworking.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;
    public long insert(User user){
        //Open Transaction
        entityManager.persist(user);
        //close Transaction
        return user.getId();

    }
}
