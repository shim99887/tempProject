package com.temp.tempproject.repository;

import com.temp.tempproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {
    @Query(value = "select * from user where id = :id and password = :password", nativeQuery = true)
    User login(String id, String password);
}
