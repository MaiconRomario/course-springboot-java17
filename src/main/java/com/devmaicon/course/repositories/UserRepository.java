package com.devmaicon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmaicon.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
