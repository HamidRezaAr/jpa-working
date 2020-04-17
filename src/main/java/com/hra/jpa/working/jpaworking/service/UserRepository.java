package com.hra.jpa.working.jpaworking.service;

import com.hra.jpa.working.jpaworking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {



}
