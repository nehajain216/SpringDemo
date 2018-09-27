package com.nj.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nj.springdemo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
