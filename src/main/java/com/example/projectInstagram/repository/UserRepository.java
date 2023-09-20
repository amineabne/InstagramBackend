package com.example.projectInstagram.repository;

import com.example.projectInstagram.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findByEmailAndMotDePasse(String email, String motDePasse);
}
