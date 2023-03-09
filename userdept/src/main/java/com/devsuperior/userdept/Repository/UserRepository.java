package com.devsuperior.userdept.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
