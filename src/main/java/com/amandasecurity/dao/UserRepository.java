package com.amandasecurity.dao;

import com.amandasecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
