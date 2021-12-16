package com.example.springboot.jpa.jpa;

import com.example.springboot.jpa.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
