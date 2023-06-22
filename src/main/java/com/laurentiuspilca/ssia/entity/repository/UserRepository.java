package com.laurentiuspilca.ssia.entity.repository;

import com.laurentiuspilca.ssia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(String u);
}
