package com.example.sweatermvc.repos;

import com.example.sweatermvc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
