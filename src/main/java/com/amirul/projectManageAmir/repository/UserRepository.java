package com.amirul.projectManageAmir.repository;

import com.amirul.projectManageAmir.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
