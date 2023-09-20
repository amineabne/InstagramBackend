package com.example.projectInstagram.repository;

import com.example.projectInstagram.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Ajoutez des méthodes personnalisées pour les requêtes de posts si nécessaire.
}
