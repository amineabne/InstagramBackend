package com.example.projectInstagram.repository;

import com.example.projectInstagram.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Ajoutez des méthodes personnalisées pour les requêtes de commentaires si nécessaire.
}
