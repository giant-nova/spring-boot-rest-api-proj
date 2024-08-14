package com.project.spring_rest_api.jpa;

import com.project.spring_rest_api.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
